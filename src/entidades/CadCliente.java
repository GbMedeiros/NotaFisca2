package entidades;

import java.util.ArrayList;

public class CadCliente {
    private ArrayList<Cliente> clientes;

    public boolean exite(ArrayList<Cliente> clientes, Cliente quem) {
        boolean has = false;
        for (int i = 0; i < clientes.size(); i++) {
            for (Cliente lista : clientes) {
                if (lista.getCodigo() == quem.getCodigo()) {
                    has = true;
                }
            }
        }
        return has;
    }
}
