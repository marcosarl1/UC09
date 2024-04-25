package view;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.entities.Sale;
import net.miginfocom.swing.MigLayout;

public class SaleCalculator extends JPanel {

    private JTextField valueField;
    private JButton bttnCalc;

    public SaleCalculator() {
        init();
    }

    private void init() {
        //Setando layout com constraints do MigLayout
        setLayout(new MigLayout("fillx, insets 20", "[left]", "[][][]push[]"));

        JLabel lblTitle = new JLabel("Calcular venda");
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 24));
        JLabel lblValor = new JLabel("Valor da venda");
        valueField = new JTextField();
        valueField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Insira o valor da venda");

        //Adicionando ao panel
        add(lblTitle, "gapbottom 45, wrap");
        add(lblValor, "wrap");
        add(valueField, "growx");

        //Criando label para que o botão possa ficar no canto inferior direito da tela
        JPanel bttnPanel = new JPanel(new MigLayout("wrap, insets 20", "[right]"));
        bttnCalc = new JButton("Calcular");

        bttnPanel.add(bttnCalc, "tag apply, pushx");

        add(bttnPanel, "dock south, wrap");

        bttnCalc.addActionListener(l -> {
            try {
                double price = Double.parseDouble(valueField.getText());
                Sale sale = new Sale(price);
                String discountInput = JOptionPane.showInputDialog(null, "Insira a porcentagem de desconto", 
                        "Solicitar desconto", JOptionPane.DEFAULT_OPTION);
                double discount = Double.parseDouble(discountInput);
                sale.requestDiscount(discount);
                JOptionPane.showMessageDialog(null, 
                        String.format("Preço original: R$%.2f %nPreço com desconto: R$%.2f", price, sale.getPrice()), 
                        "Detalhes da venda", JOptionPane.INFORMATION_MESSAGE);
                valueField.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Insira um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
                valueField.setText("");
            }
        });
    }
}
