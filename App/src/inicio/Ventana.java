package inicio;

import inicio.home;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Ventana extends JFrame implements ActionListener {

    private JLabel texto;           // etiqueta o texto no editable
    private JLabel texto1;
    private JTextField caja;        // caja de texto, para insertar datos
    private JPasswordField caja1;
    private JButton boton;          // boton con una determinada accion
    private JButton boton1;

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes

    }

    private void configurarVentana() {
        this.setTitle("Login");                                 // colocamos titulo a la ventana
        this.setSize(310, 480);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
        setLocationRelativeTo(null);
        setFocusable(true);
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        texto1 = new JLabel();
        caja = new JTextField();
        caja1 = new JPasswordField();
        boton = new JButton();
        boton1 = new JButton();
        // configuramos los componentes
        texto.setText("Usuario");                                             // colocamos un texto a la etiqueta
        texto.setBounds(50, 300, 100, 25);                                    // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        texto1.setText("Contraseña");
        texto1.setBounds(50, 350, 100, 25);
        caja.setBounds(150, 300, 100, 25);                                    // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        caja1.setBounds(150, 350, 100, 25);
        boton.setText("Entrar");                                              // colocamos un texto al boton
        boton.setBounds(50, 400, 200, 30);                                    // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);                                        // hacemos que el boton tenga una accion y esa accion estara en esta clase
        boton1.setBounds(2, 50, 300, 200);
        ImageIcon usu = new ImageIcon("src/fotos/logo.png");
        boton1.setIcon(new ImageIcon(usu.getImage().getScaledInstance(boton1.getWidth() - 10, boton1.getHeight() - 10, Image.SCALE_SMOOTH)));
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(texto1);
        this.add(caja);
        this.add(caja1);
        this.add(boton);
        this.add(boton1);
    }
    public static String usuario="";
    @Override
    public void actionPerformed(ActionEvent e) {
        usuario = caja.getText();                                      // obtenemos el contenido de la caja de texto
        String contraseña = caja1.getText();
        if (usuario.equalsIgnoreCase("Hat Kid") && contraseña.equalsIgnoreCase("123")||usuario.equalsIgnoreCase("Dr.Strange") && contraseña.equalsIgnoreCase("123")) {
            JOptionPane.showMessageDialog(this, "Hola " + usuario);           // mostramos un mensaje (frame, mensaje)
            home h = new home();
            h.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña inválidos");    // mostramos un mensaje (frame, mensaje)
        }
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();                                            // creamos una ventana
        V.setVisible(true);                                                   // hacemos visible la ventana creada
    }
}
