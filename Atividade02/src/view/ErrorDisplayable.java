package view;

import javax.swing.JOptionPane;

public interface ErrorDisplayable {
    default void displayError(String errorMsg) {
        JOptionPane.showMessageDialog(null, errorMsg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
