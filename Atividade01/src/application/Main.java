package application;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import javax.swing.JFrame;

import view.SaleCalculator;

public class Main extends JFrame{
    
    public Main(){
        init(); 
    }
    
    private void init(){
        //Configura��es do Frame.
        setTitle("Atividade01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(360,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(new SaleCalculator());
    }
    
    public static void main(String[] args) {
        //Utilizando o Look and Feel FlatLaf para aprimorar apar�ncia da aplica��o.
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> new Main().setVisible(true));
    }
}
