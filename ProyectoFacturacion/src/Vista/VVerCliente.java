package Vista;

import Modelo.Cliente;
import Modelo.ClienteBD;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VVerCliente extends JFrame {

    JList JlClientes;// cuadro combinado con los nombres de los clientes
    JLabel etiqueta;
    JTextArea listatexto;
    JPanel panel;
    JTextField jxtCedula = new JTextField(20);
    JButton aceptar = new JButton("Aceptar");
    String cedula;

    DefaultListModel cargar = new DefaultListModel();
    ClienteBD cliente;

    public VVerCliente() {
        super("CLIENTES");
        dispose();
        setLocation(200, 100);
        cargarModelo();
        cargarModel();
        setSize(400, 400);
        crearComponentes();
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void crearComponentes() {
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        b.insets = new Insets(10, 50, 20, 10);
        b.gridx = 0;
        b.gridy = 0;
        //se cargan la lista de clientes que han alquilado algun producto
        JlClientes = new JList(cargar);
        panel.add(JlClientes, b);
        //etiqueta
        b.gridx = 0;
        b.gridy = 0;
        etiqueta = new JLabel("CLIENTES CON ALQUILER");
        panel.add(etiqueta, b);

        b.gridx = 0;
        b.gridy = 1;
        panel.add(jxtCedula, b);

        b.gridx = 0;
        b.gridy = 2;
        panel.add(aceptar, b);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cedula = jxtCedula.getText();
            }
        });

        b.gridx = 1;
        b.gridy = 0;
        listatexto = new JTextArea("CLIENTES QUE HAN ADQUIRIDO UN PRODUCTO", 5, 10);
        listatexto.setEditable(true);
        panel.add(listatexto, b);
    }

    public void cargarModelo() {
        ArrayList<String> nom = ClienteBD.cargarNombres();
        for (int i = 0; i < nom.size(); i++) {
            cargar.addElement(nom.get(i));
        }
    }

    public void cargarModel() {
        ArrayList<String> nom_pro = ClienteBD.cargarVenta(cedula);
        for (int i = 0; i < nom_pro.size(); i++) {
            cargar.addElement(nom_pro.get(i));
        }
    }

    public static void main(String[] args) {
        VVerCliente objeto = new VVerCliente();
    }
}
