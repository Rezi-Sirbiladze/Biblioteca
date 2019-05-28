/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class perfil extends JFrame implements ActionListener {

    private JLabel borde;
    private JTextField caja;
    private JButton boton;
    private JLabel Logo;
    private JLabel iPers;
    private JList<String> texto;
    private JButton back;

    public perfil() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        this.setTitle("Esta Es Una Ventana");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        // creamos los componentes
        borde = new JLabel();
        texto = new JList();
        caja = new JTextField();
        boton = new JButton();
        Logo = new JLabel();
        iPers = new JLabel();
        back = new JButton();
        Ventana usu = new Ventana();
        texto.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        texto.setBounds(420, 210, 400, 250);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(340, 60, 400, 40);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setIcon(new ImageIcon("src/Perfil/Imagenes/Search.png"));   // colocamos un texto al boton
        boton.setBounds(740, 60, 40, 40);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        Logo.setIcon(new ImageIcon("src/Perfil/Imagenes/Logo.png"));
        Logo.setBounds(10, 10, 150, 70);
        back.setText("Menu");
        back.setBounds(30, 635, 200, 30);
        back.addActionListener(this);
        
        if (usu.usuario.equalsIgnoreCase("Hat Kid")) {
            iPers.setBounds(240, 210, 120, 120);
            iPers.setIcon(new ImageIcon("src/Perfil/Imagenes/FotoUsu.png"));
            iPers.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            texto.setModel(new javax.swing.AbstractListModel<String>() {
                String[] frase = {"Nombre:" + usu.usuario, "Ciudad: Mafia Town", "Idiomas: Ingles, Español", "Categorias Gustadas: Aventuras y Comedia"};

                public int getSize() {
                    return frase.length;
                }

                public String getElementAt(int i) {
                    return frase[i];
                }
            });
        } else if (usu.usuario.equalsIgnoreCase("Dr.Strange")) {
            iPers.setBounds(240, 210, 120, 120);
            iPers.setIcon(new ImageIcon("src/Perfil/Imagenes/FotoUsu2.png"));
            iPers.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            texto.setModel(new javax.swing.AbstractListModel<String>() {
                String[] frase = {"Nombre:" + usu.usuario, "Ciudad: Nueva York", "Idiomas: Ingles, Español", "Categorias Gustadas: Historia y Alquimia"};

                public int getSize() {
                    return frase.length;
                }

                public String getElementAt(int i) {
                    return frase[i];
                }
            });
        }
        borde.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        borde.setBounds(0, 0, 1275, 110);
        borde.setOpaque(true);
        borde.setBackground(Color.decode("#a9834f"));
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(caja);
        this.add(boton);
        this.add(Logo);
        this.add(iPers);
        this.add(back);
        this.add(borde);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            home h = new home();
            h.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        perfil V = new perfil();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
