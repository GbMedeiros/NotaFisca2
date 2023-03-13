package entidades;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private final int codigo;

    public Cliente(String name, int cod) {
        nome = name;
        this.codigo = cod;
    }

    public String getNome() {
        return nome;
    }

    public double getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s Codigo: %3d", nome, codigo);
    }
}
