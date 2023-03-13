package entidades;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int cod, String name, double price) {
        codigo = cod;
        nome = name;
        preco = price;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(" %d   %s   %.2f%n ", codigo, nome, preco);
    }
}
