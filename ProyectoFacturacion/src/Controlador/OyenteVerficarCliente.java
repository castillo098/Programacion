package Controlador;

import Modelo.ClienteBD;
import Modelo.Cliente;
import Vista.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OyenteVerficarCliente implements ActionListener {

    VRegistrarCliente cliente;
    ClienteBD base;
    Cliente c;

    public OyenteVerficarCliente(VRegistrarCliente v) {
        this.cliente = v;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            c = base.buscarCliente(cliente.verificarAlumno());
            System.out.println(c.getCedula());
        } catch (Exception x) {
            System.out.println("Error" + x);
        }

        if (c.getCedula() == null) {
            cliente.limpiarCampos();
            cliente.bloquearCampos();
        } else {

            JOptionPane.showMessageDialog(cliente, "El cliente " + c.getNombres() + " "
                    + c.getApellidos() + " ya se encuentra registrado ");
            cliente.desbloquearCampos();
        }

    }
}
