package Controlador;

import Vista.VIniciarSesion;
import Vista.VProductos;
import Vista.VRegistrarCliente;
import Vista.VVenta;
import Vista.VVerCliente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OyenteVentanaPrincipal extends JFrame {

    JMenuBar menu = new JMenuBar();
    JMenu menu1;
    JMenuItem InicioSesion, RegistrarCliente, Salir, VerCliente, RegistrarVenta, RegistrarProducto;

    /*JMenuBar menu2 = new JMenuBar();
    JMenu menu02;
    JMenuItem RegistrarProducto;*/
    public OyenteVentanaPrincipal() {
        dispose();
        setSize(400, 400);
        setLocationRelativeTo(null);
        iniciarComponentes();
        setVisible(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }

    public JMenuItem getInicioSecion() {
        return InicioSesion;
    }

    public JMenuItem getRegistrarVenta() {
        return RegistrarVenta;
    }

    public JMenuItem getRegistrarCliente() {
        return RegistrarCliente;
    }

    public JMenuItem getRegistrarProducto() {
        return RegistrarProducto;
    }

    public JMenuItem getVerCliente() {
        return VerCliente;
    }

    public JMenuItem getMiSalir() {
        return Salir;
    }

    private void iniciarComponentes() {
        
        setJMenuBar(menu);
        menu1 = new JMenu("Cliente");
        menu.add(menu1);

        InicioSesion = new JMenuItem("Inicio de Sesion");
        InicioSesion.addActionListener(new VentanaP());
        menu1.add(InicioSesion);

        RegistrarCliente = new JMenuItem("Registrar Cliente");
        RegistrarCliente.addActionListener(new VentanaP());
        menu1.add(RegistrarCliente);

        RegistrarVenta = new JMenuItem("Registrar Venta");
        RegistrarVenta.addActionListener(new VentanaP());
        menu1.add(RegistrarVenta);

        RegistrarProducto = new JMenuItem("Registrar Producto");
        RegistrarProducto.addActionListener(new VentanaP());
        menu1.add(RegistrarProducto);

        VerCliente = new JMenuItem("Ver Cliente");
        VerCliente.addActionListener(new VentanaP());
        menu1.add(VerCliente);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new VentanaP());
        menu1.add(Salir);
        
        
        menu.setBackground(Color.yellow);
        menu1.setBackground(Color.LIGHT_GRAY);
        InicioSesion.setBackground(Color.CYAN);
        RegistrarCliente.setBackground(Color.CYAN);
        Salir.setBackground(Color.CYAN);
        VerCliente.setBackground(Color.cyan);
        RegistrarVenta.setBackground(Color.CYAN);
        RegistrarProducto.setBackground(Color.CYAN);
        /////////////////////
        /*setJMenuBar(menu2);
        menu02 = new JMenu("Productos");
        menu2.add(menu02);
         */
    }

    public class VentanaP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Salir) {
                System.exit(0);
            }
            if (e.getSource() == InicioSesion) {
                VIniciarSesion v = new VIniciarSesion();

            }
            if (e.getSource() == RegistrarCliente) {
                VRegistrarCliente p = new VRegistrarCliente();

            }
            if (e.getSource() == RegistrarVenta) {
                VVenta i = new VVenta();

            }
            if (e.getSource() == VerCliente) {
                VVerCliente vvc = new VVerCliente();

            }
            if (e.getSource() == RegistrarProducto) {
                VProductos r = new VProductos();

            }
            /*if (e.getSource() == miAleartoria) {
                 VAleartorioAlumnos i = new VAleartorioAlumnos();

            }*/
        }
    }

    public static void main(String[] args) {
        OyenteVentanaPrincipal o = new OyenteVentanaPrincipal();

    }

}
