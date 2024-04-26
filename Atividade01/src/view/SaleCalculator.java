package view;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

import controller.SaleController;
import java.awt.Color;

public class SaleCalculator extends JPanel {

    private JTextField valueField;
    private JButton bttnCalc;

    public SaleCalculator() {
        init();
    }

    public JTextField getValueField() {
        return valueField;
    }

    private void init() {
        //Setando layout com constraints do MigLayout
        setLayout(new MigLayout("fillx, insets 20", "[left]", "[][][][]push[]"));

        JLabel lblTitle = new JLabel("Calcular venda");
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 24));
        
        valueField = new JTextField();
        valueField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Insira o valor da venda"); //Utilizando FlatLaf para adicionar texto PlaceHolder aumentar acessibilidade do programa.
        valueField.setToolTipText("Insira o valor da venda");
        
        JLabel hintLabel = new JLabel("Use '.' para casas decimais (ex: 99.99)");
        hintLabel.setFont(new Font(hintLabel.getName(), Font.PLAIN, 10));
        

        //Adicionando ao panel
        add(lblTitle, "gapbottom 45, wrap");
        add(new JLabel("Valor da venda (R$)"), "wrap");
        add(valueField, "growx, wrap");
        add(hintLabel, "gapy 0, span");

        //Criando label para que o botão possa ficar no canto inferior direito da tela
        JPanel bttnPanel = new JPanel(new MigLayout("wrap, insets 20", "[right]"));
        bttnCalc = new JButton("Calcular");
        bttnCalc.setBackground(new Color(0,122,255));
        bttnCalc.setForeground(Color.WHITE);
        bttnCalc.setFont(new Font(bttnCalc.getName(), Font.BOLD, 12));

        bttnPanel.add(bttnCalc, "tag apply, pushx");

        add(bttnPanel, "dock south, wrap");

        //Adicionando Listener para botão calcular
        bttnCalc.addActionListener(l -> {
            SaleController.calculateSale(this);
            valueField.setText("");
        });
    }
}
