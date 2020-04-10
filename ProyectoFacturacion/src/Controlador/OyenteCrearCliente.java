package Controlador;

import Modelo.Cliente;
import Modelo.ClienteBD;
import Vista.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearCliente implements ActionListener {

    VRegistrarCliente Rcliente;
    ClienteBD base;
    Cliente cliente;

    public OyenteCrearCliente(VRegistrarCliente c) {
        this.Rcliente = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo un cliente
        cliente = Rcliente.guardarCliente();
        //en la base de datos se registra un cliente a guardar
        base.guardarClienteBD(cliente);
        //envio  a limpiar los campos
        Rcliente.limpiarCampos();
        //Rcliente.bloquearCampos();
    }

}
