package application;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;

import view.Home;

public class Main {

    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }
}