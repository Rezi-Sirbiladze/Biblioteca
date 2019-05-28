package inicio;

import fotos.fondo;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class configuracion extends JFrame implements ActionListener {

    private JLabel texto;
    private JLabel texto1;
    private JButton boton;
    fondo f;

    public configuracion() {
        super();
        configurarVentana();
        inicializarComponentes();
        Container contentpane = getContentPane();
        f = new fondo();
        contentpane.add(f);
    }

    private void configurarVentana() {
        this.setTitle("Configuración");
        this.setSize(800, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setFocusable(true);
    }

    private void inicializarComponentes() {
        boton = new JButton();
        boton.setText("Menu");
        boton.setBounds(30, 635, 200, 30);
        boton.addActionListener(this);
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            home h = new home();
            h.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        configuracion c = new configuracion();
        c.setVisible(true);
    }
}
