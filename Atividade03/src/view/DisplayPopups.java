package view;

import javax.swing.JOptionPane;


public interface DisplayPopups {
    default void displayError(String errorMsg){
        JOptionPane.showMessageDialog(null, errorMsg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    default void displaySuccess(String successMsg){
        JOptionPane.showMessageDialog(null, successMsg, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
