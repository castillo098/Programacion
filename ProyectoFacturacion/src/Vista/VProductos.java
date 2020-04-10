package Vista;

import Controlador.OyenteCrearProducto;
import Controlador.OyenteCrearVenta;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Venta;
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

public class VProductos extends JFrame {

    JTextField txtfCodigo = new JTextField(20);
    JTextField txtfNomproducto = new JTextField(20);
    JTextField txtfPrecios = new JTextField(20);
    JComboBox tproducto = new JComboBox();
    JComboBox mproducto = new JComboBox();
    JTextField txtfStock = new JTextField(20);
    JLabel etiqueta = new JLabel();
    JButton botonguardar;
    JButton botonverficar;

    Producto producto;
    ImageIcon image = new ImageIcon(getClass().getResource("/imagen/moda.png"));

    public VProductos() {
        super("REGISTRAR PRODUCTO");
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

        JPanel contenedor, panel, panelB;
        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.CYAN);

        contenedor = new JPanel(new GridBagLayout());
        panelB = new JPanel();
        panelB.setBackground(Color.YELLOW);
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
        panel.add(new JLabel("Nombre Del Producto"), op);
        //texfild de nombre
        op.gridx = 3;
        op.gridy = 1;
        panel.add(txtfNomproducto, op);
        //
        op.gridx = 0;
        op.gridy = 1;
        panel.add(new JLabel("Codigo Del Producto"), op);
        //
        op.gridx = 1;
        panel.add(txtfCodigo, op);
        //
        botonverficar = new JButton("Verificar");
        op.gridx = 3;
        op.gridy = 7;
        /*panel.add(botonverficar, op);*/

        //etiqueta de nombres
        op.gridx = 1;
        op.gridy = 1;
        panel.add(new JLabel("Nombres"), op);

        //etiqueta apellidos
        op.gridx = 0;
        op.gridy = 2;
        panel.add(new JLabel("Precios"), op);
        //Texfiel de apellidos
        op.gridx = 1;
        panel.add(txtfPrecios, op);

        Vector tproducto1 = new Vector();
        tproducto1.addElement("");
        tproducto1.addElement("Rops Deportiva");
        tproducto1.addElement("Ropa Formal");
        tproducto1.addElement("Ropa Informal");
        tproducto1.addElement("Ropa de trabajo");
        tproducto1.addElement("Ropa de abrigo");
        tproducto1.addElement("Uniformes");
        tproducto1.addElement("Ropa para mujeres embarazadas");

        tproducto = new JComboBox(tproducto1);
        tproducto.setPreferredSize(new Dimension(230, 25));

        op.gridx = 0;
        op.gridy = 3;
        panel.add(new JLabel("Tipo de producto"), op);
        op.gridx = 1;
        panel.add(tproducto, op);

        op.gridx = 2;
        op.gridy = 2;
        panel.add(new JLabel("Stock"), op);
        op.gridy = 2;
        op.gridx = 3;
        panel.add(txtfStock, op);

        Vector material = new Vector();

        material.addElement("");
        material.addElement("Poliester");
        material.addElement("Lana");
        material.addElement("Algodon");
        material.addElement("Lino");
        material.addElement("Planas");
        material.addElement("Terciopelo");

        mproducto = new JComboBox(material);
        mproducto.setPreferredSize(new Dimension(230, 25));

        op.gridx = 0;
        op.gridy = 4;
        panel.add(new JLabel("Material de producto"), op);
        op.gridx = 1;
        panel.add(mproducto, op);

        botonguardar = new JButton("GUARDAR");
        botonguardar.addActionListener(new OyenteCrearProducto(this));
        /*JButton btnEliminar = new JButton("ELIMINAR");*/
//        btnEliminar.addActionListener(new OyenteEliminarAlumno(this));
        /*JButton btnActualizar = new JButton("ACTUALIZAR");*/
        //btnActualizar.addActionListener(new OyenteActualizarEstudiante(this));
        panelB.add(botonguardar);
        /*panelB.add(btnEliminar);
        panelB.add(btnActualizar);*/
        panelB.add(botonguardar);
        a.gridx = 0;
        a.gridy = 0;
        contenedor.add(panel, a);
        a.gridy = 1;
        contenedor.add(panelB, a);
        setContentPane(contenedor);
    }

    public Producto guardarProducto() {
        producto = new Producto();
        producto.setCod_producto(txtfCodigo.getText());
        producto.setPrecios(txtfPrecios.getText());
        producto.setTipo_producto((String) tproducto.getSelectedItem());
        producto.setMate_producto((String) mproducto.getSelectedItem());
        producto.setNom_producto(txtfNomproducto.getText());
        producto.setStock(txtfStock.getText());
        return producto;

    }

    public void limpiarCampos() {
        txtfCodigo.setText("");
        txtfPrecios.setText("");
        tproducto.setSelectedIndex(0);
        txtfNomproducto.setText("");
        mproducto.setSelectedIndex(0);
        txtfStock.setText("");
    }

    public static void main(String[] args) {
        VProductos ob = new VProductos();
    }
}
