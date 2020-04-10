package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VIniciarSesion extends JFrame {
    
    JTextField textousuario = new JTextField(20);
    JPasswordField textocontraseña = new JPasswordField(20);
    JLabel usuario = new JLabel("USUARIO");
    JLabel contraseña = new JLabel("CONTRASEÑA");
    JButton salir = new JButton("Salir");
    JButton Ingresar = new JButton("Ingresar");
    
    JLabel image = new JLabel();
    ImageIcon imagen = new ImageIcon(getClass().getResource("/imagen/c.png"));
    
    JPanel panel = new JPanel();
    // ImageIcon fondo =  new ImageIcon(getClass().getResource("/imagen/a.jpg"));

    public VIniciarSesion() {
        super("INGRESAR");
        dispose();
        setSize(400, 400);
        image.setIcon(imagen);
        //fondo.setImageObserver(panel);
        setLocationRelativeTo(null);
        crearComponentes();
        setVisible(true);
        setResizable(false);
        pack();
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        
    }
    
    public void crearComponentes() {
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        b.insets = new Insets(10, 50, 20, 10);
        //imagen
        b.gridx = 0;
        b.gridy = 1;
        panel.add(image, b);

        //etiqueta usuario
        b.gridx = 1;
        b.gridy = 0;
        panel.add(usuario, b);

        //textfild usuario
        b.gridx = 2;
        b.gridy = 0;
        panel.add(textousuario, b);

        //Etiqueta Contraseña
        b.gridx = 1;
        b.gridy = 1;
        panel.add(contraseña, b);

        //textocontraseña
        b.gridx = 2;
        b.gridy = 1;
        panel.add(textocontraseña, b);

        //Boton ingresar
        b.gridx = 2;
        b.gridy = 2;
        panel.add(Ingresar, b);

        //Boton salir
        b.gridx = 1;
        b.gridy = 2;
        panel.add(salir, b);
        
        salir.addActionListener((ae) -> {
            dispose();
        });
        Ingresar.addActionListener((ae) -> {
            VRegistrarCliente rc = new VRegistrarCliente();
            
        }
        );
    }
    
    public static void main(String[] args) {
        VIniciarSesion venta = new VIniciarSesion();
    }
}
