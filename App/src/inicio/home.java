package inicio;

import fotos.fondo;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class home extends JFrame implements ActionListener {

    private JLabel texto;
    private JLabel texto1;
    private JButton boton;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    fondo f;

    public home() {
        super();
        configurarVentana();
        inicializarComponentes();
        Container contentpane = getContentPane();
        f = new fondo();
        contentpane.add(f);
    }

    private void configurarVentana() {
        this.setTitle("Menu");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setFocusable(true);
    }

    private void inicializarComponentes() {
        boton = new JButton();
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton("Log out");
        boton.setBounds(250, 225, 200, 200);
        boton.addActionListener(this);
        ImageIcon usu = new ImageIcon("src/fotos/usu.png");
        boton.setIcon(new ImageIcon(usu.getImage().getScaledInstance(boton.getWidth() - 10, boton.getHeight() - 10, Image.SCALE_SMOOTH)));
        boton1.setBounds(500, 225, 200, 200);
        boton1.addActionListener(this);
        ImageIcon libro = new ImageIcon("src/fotos/libro.png");
        boton1.setIcon(new ImageIcon(libro.getImage().getScaledInstance(boton1.getWidth() - 10, boton1.getHeight() - 10, Image.SCALE_SMOOTH)));
        boton2.setBounds(750, 225, 200, 200);
        boton2.addActionListener(this);
        ImageIcon config = new ImageIcon("src/fotos/config.png");
        boton2.setIcon(new ImageIcon(config.getImage().getScaledInstance(boton2.getWidth() - 10, boton2.getHeight() - 10, Image.SCALE_SMOOTH)));
        boton3.setBounds(30, 635, 200, 30);
        boton3.addActionListener(this);

        this.add(boton);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            perfil p = new perfil();
            p.setVisible(true);
            dispose();

        } else if (e.getSource() == boton1) {
            libros l = new libros();
            l.setVisible(true);
            dispose();
        } else if (e.getSource() == boton2) {
            configuracion c = new configuracion();
            c.setVisible(true);
            dispose();
        } else {
            Ventana v = new Ventana();
            v.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        home h = new home();
        h.setVisible(true);
    }
}
