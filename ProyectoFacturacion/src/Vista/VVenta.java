package Vista;

import Controlador.OyenteCrearVenta;
import Modelo.Cliente;
import Modelo.Venta;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VVenta extends JFrame {

    JTextField tfCedula = new JTextField(20);
    JTextField tfNombres = new JTextField(20);
    JTextField tfPrecio = new JTextField(20);
    JTextField tfCantidad = new JTextField(20);
    JTextField tfestadodeproducto = new JTextField(20);
    JTextField tfcedulacomprador = new JTextField(20);
    JTextField tfcodigodeprocucto = new JTextField(20);
    JTextField tfnombredeproducto = new JTextField(20);
    JTextField tftipodeproducto = new JTextField(20);
    JLabel etiqueta = new JLabel();
    JButton aceptar;
    Venta venta;

    ImageIcon image = new ImageIcon(getClass().getResource("/imagen/moda.png"));
    JCalendar calendario = new JCalendar();

    //calendario = new DateChooserPanel();
    public VVenta() {
        super("REGISTRAR VENTA");
        setLocation(200, 100);
        etiqueta.setIcon(image);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        agregarComponentes();
        pack();
        setResizable(false);
        setVisible(true);
    }

    private void agregarComponentes() {

        JPanel contentpane, panel, panel2 = null;
        panel = new JPanel(new GridBagLayout());
        contentpane = new JPanel(new GridBagLayout());
        panel2 = new JPanel();
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
        panel.add(new JLabel("Codigo del producto"), op);
        //texfield de nombre
        op.gridx = 3;
        op.gridy = 1;
        panel.add(tfcodigodeprocucto, op);
        //
        op.gridx = 0;
        op.gridy = 1;
        panel.add(new JLabel("ID Venta"), op);
        //
        op.gridx = 1;
        panel.add(tfCedula, op);
        //etiqueta de nombres
        op.gridx = 1;
        op.gridy = 1;
        panel.add(new JLabel("Nombres"), op);
        //etiqueta comprador
        op.gridx = 0;
        op.gridy = 2;
        panel.add(new JLabel("Cedula del comprador"), op);
        //Texfield de comprador
        op.gridx = 1;
        op.gridy = 2;
        panel.add(tfcedulacomprador, op);

        //etiqueta cantidad
        op.gridx = 0;
        op.gridy = 4;
        panel.add(new JLabel("Cantidad"), op);
        //textfild de casa
        op.gridy = 4;
        op.gridx = 1;
        panel.add(tfCantidad, op);

        //etiqueta de producto
        op.gridx = 0;
        op.gridy = 3;
        panel.add(new JLabel("Estado de producto"), op);
        //textfild de estado de producto
        op.gridx = 1;
        op.gridy = 3;
        panel.add(tfestadodeproducto, op);
        //etiqueta nombre de producto
        op.gridx = 2;
        op.gridy = 2;
        panel.add(new JLabel("Nombre de producto"), op);
        //textfild nombre de producto
        op.gridy = 2;
        op.gridx = 3;
        panel.add(tfnombredeproducto, op);

        //etiqueta tipo de producto
        op.gridx = 2;
        op.gridy = 3;
        panel.add(new JLabel("Tipo de producto"), op);
        //textfild nombre de producto
        op.gridy = 3;
        op.gridx = 3;
        panel.add(tftipodeproducto, op);
        //etiqueta precio
        op.gridx = 2;
        op.gridy = 4;
        panel.add(new JLabel("Precio"), op);
        //textfild precio
        op.gridy = 4;
        op.gridx = 3;
        panel.add(tfPrecio, op);
        //boton Aceptar
        aceptar = new JButton("ACEPTAR");
        JButton eliminar = new JButton("ELIMINAR");
        panel2.add(aceptar);
        /*panel2.add(eliminar);*/
        panel2.add(aceptar);
        a.gridx = 0;
        a.gridy = 0;
        contentpane.add(panel, a);
        a.gridx = 0;
        a.gridy = 2;
        contentpane.add(panel2, a);
        setContentPane(contentpane);
        //Posicion del Jcalendar;
        a.gridx = 3;
        a.gridy = 5;
        panel.add(calendario, a);

        aceptar.addActionListener(new OyenteCrearVenta(this));
        /*eliminar.addActionListener((ae) -> {
            dispose();
        
        }
        );*/

    }

    public Venta guardarVenta() {
        venta = new Venta();
        venta.setId_producto(tfcodigodeprocucto.getText());
        venta.setCod_producto(tfcodigodeprocucto.getText());
        venta.setCed_comprador(tfCedula.getText());
        venta.setNom_producto(tfnombredeproducto.getText());
        venta.setEstado_producto(tfestadodeproducto.getText());
        venta.setPrecio(tfPrecio.getText());
        venta.setCantidad(tfCantidad.getText());
        venta.setTipo_producto(tftipodeproducto.getText());

        return venta;

    }

    public static void main(String[] args) {
        VVenta w = new VVenta();
    }

}
