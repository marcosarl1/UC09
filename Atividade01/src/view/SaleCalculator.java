package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.entities.Sale;

public class SaleCalculator extends JFrame {

    private JTextField txtValue;
    private JButton bttnCalc;

    private static final Double MIN_PRICE_FOR_DISCOUNT = 500.00;

    public SaleCalculator() {
        init();
        setTitle("Calculadora de Venda");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JTextField getValueField() {
        return txtValue;
    }

    private void init() {
        //Setando layout com constraints do MigLayout
        setLayout(new MigLayout("fillx, insets 20", "[left]", "[][][][]push[]"));

        JLabel lblTitle = new JLabel("Calcular venda");
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 24));

        txtValue = new JTextField();
        txtValue.setToolTipText("Insira o valor da venda");

        JLabel hintLabel = new JLabel("Use '.' para casas decimais (ex: 99.99)");
        hintLabel.setFont(new Font(hintLabel.getName(), Font.PLAIN, 10));

        //Adicionando ao panel
        add(lblTitle, "gapbottom 45, wrap");
        add(new JLabel("Valor da venda (R$)"), "wrap");
        add(txtValue, "growx, wrap");
        add(hintLabel, "gapy 0, span");

        //Criando label para que o botão possa ficar no canto inferior direito da tela
        JPanel bttnPanel = new JPanel(new MigLayout("wrap, insets 20", "[right]"));
        bttnCalc = new JButton("Calcular");
        bttnCalc.setBackground(new Color(0, 122, 255));
        bttnCalc.setForeground(Color.WHITE);
        bttnCalc.setFont(new Font(bttnCalc.getName(), Font.BOLD, 12));

        bttnPanel.add(bttnCalc, "tag apply, pushx");

        add(bttnPanel, "dock south, wrap");

        //Adicionando Listener para botão calcular
        bttnCalc.addActionListener(l -> {
            calculateSale();
            txtValue.setText("");
        });
    }

    private void calculateSale() {
        try {
            double price = Double.parseDouble(txtValue.getText());
            if (price <= 0) {
                throw new IllegalArgumentException("O valor da venda deve ser maior que zero.");
            }
            if (price > MIN_PRICE_FOR_DISCOUNT) {
                Sale sale = new Sale(price);
                String discountInput = JOptionPane.showInputDialog(null, "Insira a porcentagem de desconto.",
                        "Solicitar desconto", JOptionPane.DEFAULT_OPTION);
                if (discountInput == null) { // Caso usuário feche popup de requisição de porcentagem, voltar para tela inicial
                    return;
                }
                double discount = Double.parseDouble(discountInput);
                sale.requestDiscount(discount); // Chamando método da lógica de desconto da classe Sale
                JOptionPane.showMessageDialog(null,
                        String.format("Preço original: R$%.2f %nPreço com desconto: R$%.2f", price, sale.getPrice()),
                        "Detalhes da venda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("Preço total: R$%.2f", price),
                        "Detalhes da venda", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) { // Erro para campo vazio ou com input diferente de formato com ponto flutante (divisor ".")
            if (txtValue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira o valor da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) { // Erro para lidar com valores negativos e porcentagem menor que zero ou maior que cem
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (RuntimeException e) { // Erros inesperados em tempo de execução
            JOptionPane.showMessageDialog(null, "Erro inesperado! Tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
