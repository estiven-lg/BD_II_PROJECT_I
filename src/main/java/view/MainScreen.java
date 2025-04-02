package view;

import javax.swing.*;
import java.awt.*;
import view.ATMScreen;

public class MainScreen extends JFrame {

    private CardLayout cardLayout;
    private JPanel panelPrincipal;

    public MainScreen() {
        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        // Agregar pantallas
        panelPrincipal.add(new ATMScreen(this), "Cajeros");
        panelPrincipal.add(new CardScreen(this), "Targetas");

        add(panelPrincipal);
        setVisible(true);
    }

    // Método para cambiar de pantalla
    public void setScreen(String screen) {
        cardLayout.show(panelPrincipal, screen);
        setTitle(screen);

    }
}
