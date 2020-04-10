package Vista;

import Controlador.OyenteCrearCliente;
import Modelo.Cliente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VRegistrarCliente extends JFrame {

    JTextField tfCedula = new JTextField(20);
    JTextField tfNombres = new JTextField(20);
    JTextField tfApellidos = new JTextField(20);
    JComboBox barrio;
    JTextField tfTelefono = new JTextField(20);
    JTextField tfdireccion = new JTextField(20);
    JTextField tfcorreo = new JTextField(20);
    JTextField tfcasa = new JTextField(20);

    JButton botonguardar;
    Cliente cliente;
    JLabel etiqueta = new JLabel();
    ImageIcon image = new ImageIcon(getClass().getResource("/imagen/casa.png"));

    public VRegistrarCliente() {
        super("REGISTRAR CLIENTE");
        setLocation(200, 100);
        etiqueta.setIcon(image);
        //setSize(450,450);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        agregarComponentes();
        //bloquearCampos();
        setResizable(false);
        pack();
        setVisible(true);

    }

    private void agregarComponentes() {

        JPanel contentpane, panel, panelB;
        panel = new JPanel(new GridBagLayout());
        contentpane = new JPanel(new GridBagLayout());
        panelB = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panelB.setBackground(Color.yellow);
        GridBagConstraints op = new GridBagConstraints();
        GridBagConstraints a = new GridBagConstraints();
        op.anchor = GridBagConstraints.WEST;
        op.insets = new Insets(10, 15, 10, 15);
        //etiqueta de alquiler de ventas
        op.gridx = 2;
        op.gridy = 0;
        panel.add(etiqueta, op);
        //nombre
        op.gridx = 2;
        op.gridy = 1;
        panel.add(new JLabel("Nombres"), op);
        //texfild de nombre
        op.gridx = 3;
        op.gridy = 1;
        panel.add(tfNombres, op);
        //
        op.gridx = 0;
        op.gridy = 1;
        panel.add(new JLabel("Cedula"), op);
        //
        op.gridx = 1;
        panel.add(tfCedula, op);
        //etiqueta de nombres
        op.gridx = 1;
        op.gridy = 1;
        panel.add(new JLabel("Nombres"), op);
        //etiqueta apellidos
        op.gridx = 0;
        op.gridy = 2;
        panel.add(new JLabel("Apellidos"), op);
        //Texfiel de apellidos
        op.gridx = 1;
        panel.add(tfApellidos, op);
        //lista de los posibles barrios
        Vector vbarrio = new Vector();
        vbarrio.addElement("");
        vbarrio.addElement("Zalapa");
        vbarrio.addElement("Centro");
        vbarrio.addElement("Las Pitas");
        vbarrio.addElement("Tierrar Coloradas");
        vbarrio.addElement("El valle");
        vbarrio.addElement("Carigan");
        vbarrio.addElement("Sauces");
        vbarrio.addElement("Las Peñas");
        vbarrio.addElement("Miraflores alto");
        vbarrio.addElement("Miraflores Bajo");
        vbarrio.addElement("San Cayetano");
        vbarrio.addElement("Punzara");
        vbarrio.addElement("San Isidro");
        vbarrio.addElement("Capuli");
        vbarrio.addElement("Argelia");

        barrio = new JComboBox(vbarrio);
        barrio.setPreferredSize(new Dimension(260, 25));
        //etiqueta barrio
        op.gridx = 0;
        op.gridy = 3;
        panel.add(new JLabel("Barrio"), op);
        op.gridx = 1;
        panel.add(barrio, op);

        //etiqueta de telefono
        op.gridx = 2;
        op.gridy = 2;
        panel.add(new JLabel("Telefono"), op);
        op.gridy = 2;
        op.gridx = 3;
        panel.add(tfTelefono, op);

        //etiqueta ncasa
        op.gridx = 2;
        op.gridy = 3;
        panel.add(new JLabel("Nro. Casa"), op);
        //textfild de nro de casa
        op.gridy = 3;
        op.gridx = 3;
        panel.add(tfcasa, op);

        //etiqueta direccion
        op.gridx = 0;
        op.gridy = 4;
        panel.add(new JLabel("Direccion"), op);
        //textfild de direccion
        op.gridx = 1;
        op.gridy = 4;
        panel.add(tfdireccion, op);
        //etiqueta correo
        op.gridx = 2;
        op.gridy = 4;
        panel.add(new JLabel("Correo electronico"), op);
        //textfild correo
        op.gridy = 4;
        op.gridx = 3;
        panel.add(tfcorreo, op);
        //boton guardar
        botonguardar = new JButton("GUARDAR");
        botonguardar.addActionListener(new OyenteCrearCliente(this));
        JButton btnEliminar = new JButton("ELIMINAR");
        //btnEliminar.addActionListener(new OyenteEliminarAlumno(this));
        JButton btnActualizar = new JButton("ACTUALIZAR");
        //btnActualizar.addActionListener(new OyenteActualizarEstudiante(this));
        panelB.add(botonguardar);
       /* panelB.add(btnEliminar);
        panelB.add(btnActualizar);*/
        panelB.add(botonguardar);
        a.gridx = 0;
        a.gridy = 0;
        contentpane.add(panel, a);
        a.gridy = 1;
        contentpane.add(panelB, a);
        setContentPane(contentpane);

        botonguardar.addActionListener((ae) -> {
            VVenta vv = new VVenta();
        });

    }

    public Cliente guardarCliente() {
        cliente = new Cliente();
        cliente.setCedula(tfCedula.getText());
        cliente.setNombres(tfNombres.getText());
        cliente.setApellidos(tfApellidos.getText());
        cliente.setTeléfono(tfTelefono.getText());
        cliente.setBarrio((String) barrio.getSelectedItem());
        cliente.setDireccion(tfdireccion.getText());
        cliente.setNcasa(tfcasa.getText());
        cliente.setCorreo(tfcorreo.getText());

        return cliente;

    }

    public void limpiarCampos() {
        tfNombres.setText("");
        tfApellidos.setText("");
        tfTelefono.setText("");
        barrio.setSelectedIndex(0);
        tfdireccion.setText("");
        tfcasa.setText("");
        tfcorreo.setText("");
    }

    public void bloquearCampos() {

        tfNombres.setEditable(false);
        tfApellidos.setEditable(false);
        tfTelefono.setEditable(false);
        barrio.setEnabled(false);
        tfdireccion.setEditable(false);
        tfcasa.setEditable(false);
        tfcorreo.setEditable(false);
        botonguardar.setEnabled(false);
    }

    public void desbloquearCampos() {

        tfNombres.setEditable(true);
        tfApellidos.setEditable(true);
        tfTelefono.setEditable(true);
        barrio.setEnabled(true);
        tfdireccion.setEditable(true);
        tfcasa.setEditable(true);
        tfcorreo.setEditable(true);
        botonguardar.setEnabled(true);
    }

    public String verificarAlumno() {
        return tfCedula.getText();

    }

    public String eliminarCliente() {
        return tfCedula.getText();

    }

    public void cargarCampos(Cliente cliente) {

        tfNombres.setText(cliente.getNombres());
        tfApellidos.setText(cliente.getApellidos());
        tfTelefono.setText(cliente.getTelefono());
        barrio.setSelectedItem(cliente.getBarrio());
        tfdireccion.setText(cliente.getDireccion());
        tfcasa.setText(cliente.getNcasa());
        tfcorreo.setText(cliente.getCorreo());
    }

    public static void main(String[] args) {
        VRegistrarCliente ob = new VRegistrarCliente();
    }
}
