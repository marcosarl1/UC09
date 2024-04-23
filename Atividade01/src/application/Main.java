package application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import view.RegisterSale;

public class Main extends JFrame{
    
    public Main(){
        init(); 
    }
    
    private void init(){
        setTitle("Atividade01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(480,320);
        setLocationRelativeTo(null);
        setContentPane(new RegisterSale());
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Main().setVisible(true));
    }
}
