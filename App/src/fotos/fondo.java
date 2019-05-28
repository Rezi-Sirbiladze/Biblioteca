package fotos;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;

public class fondo extends JPanel {

    private Image fondo1;

    public fondo() {
        preInit();
        initComponents();
    }

    private void initComponents() {
    }

    private void preInit() {
        fondo1 = new ImageIcon("src/fotos/fondo.jpg").getImage();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(fondo1, 0, 0, getWidth(), getHeight(), this);
    }
}
