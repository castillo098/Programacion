package Controlador;

import Modelo.Cliente;
import Modelo.ClienteBD;
import Vista.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteActualizarCliente {

    public class OyenteActualizarALumno implements ActionListener {

        VRegistrarCliente cliente;
        ClienteBD base;
        Cliente c;

        public OyenteActualizarALumno(VRegistrarCliente c) {
            this.cliente = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            base = new ClienteBD();
            base.actualizarCliente(cliente.guardarCliente());

            cliente.limpiarCampos();
            cliente.bloquearCampos();

        }

    }

}
