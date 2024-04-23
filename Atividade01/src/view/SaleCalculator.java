package view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class SaleCalculator extends JPanel{
    
    private JTextField valueField;
    private JButton bttnCalc;
    
    public SaleCalculator(){
        init();
    }
    
    private void init(){
        //Setando layout com constraints do MigLayout
        setLayout(new MigLayout("fillx, insets 20", "[left]","[][][]push[]"));
        
        JLabel lblTitle = new JLabel("Calcular venda");
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 24));
        JLabel lblValor = new JLabel("Digite o valor:");
        valueField = new JTextField();
        
        //Adicionando ao panel
        add(lblTitle, "gapbottom 60, wrap");
        add(lblValor, "gapafter 10, split 2");
        add(valueField, "growx");
        
        //Criando label para que o botão possa ficar no canto inferior direito da tela
        JPanel bttnPanel = new JPanel(new MigLayout("wrap, insets 20", "[right]"));
        bttnCalc = new JButton("Calcular");
        bttnPanel.add(bttnCalc, "tag apply, pushx");
        
        add(bttnPanel, "dock south, wrap");
    }
}
