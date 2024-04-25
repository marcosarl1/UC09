package view;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

import controller.SaleController;

public class SaleCalculator extends JPanel {

    public JTextField valueField;
    private JButton bttnCalc;

    public SaleCalculator() {
        init();
    }

    private void init() {
        //Setando layout com constraints do MigLayout
        setLayout(new MigLayout("fillx, insets 20", "[left]", "[][][]push[]"));

        JLabel lblTitle = new JLabel("Calcular venda");
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 24));
        JLabel lblValor = new JLabel("Valor da venda (R$)");
        valueField = new JTextField();
        valueField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Insira o valor da venda");
        valueField.setToolTipText("Insira o valor da venda");

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
            SaleController.calculateSale(this);
            valueField.setText("");
        });
    }
}
