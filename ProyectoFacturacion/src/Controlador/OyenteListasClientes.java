package Controlador;

import Modelo.ClienteBD;
import Vista.VVerCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteListasClientes implements ActionListener {

    VVerCliente ver;
    ClienteBD base;

    public OyenteListasClientes(VVerCliente v) {
        this.ver = v;
    }

    public void actionPerformed(ActionEvent arg0) {

        // ver.actualizarEstudiante(ver.cargarCliente());
    }

}
