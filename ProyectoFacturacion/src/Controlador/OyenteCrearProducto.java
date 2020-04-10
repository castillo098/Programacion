package Controlador;

import Modelo.Cliente;
import Modelo.ClienteBD;
import Modelo.Producto;
import Vista.VProductos;
import Vista.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearProducto implements ActionListener {

    VProductos vp;
    ClienteBD base;
    Producto producto;

    public OyenteCrearProducto(VProductos vp) {
        this.vp = vp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo el VProductos
        producto = vp.guardarProducto();
        //en la base de datos se registra un cliente a guardar
        base.guardarProductoBD(producto);
        //envio  a limpiar los campos
        vp.limpiarCampos();

    }

}
