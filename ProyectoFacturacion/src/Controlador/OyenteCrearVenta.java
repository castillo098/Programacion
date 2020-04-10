package Controlador;

import Modelo.ClienteBD;
import Modelo.Venta;
import Vista.VVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearVenta implements ActionListener {

    VVenta vv;
    ClienteBD base1;
    Venta venta;

    public OyenteCrearVenta(VVenta vv) {
        this.vv = vv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Objeto de la vista VVenta para enviar el metodo guardar donde se encian los datos
        venta = vv.guardarVenta();
        //en la base de datos se registra un cliente a guardar
        base1.guardarVentaBD(venta);
        //

    }

}
