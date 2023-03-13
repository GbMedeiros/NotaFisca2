package entidades;

public class ItemVenda {
    private int qtd;
    private Produto produto;

    public ItemVenda(int qtd, Produto umProd) {
        this.qtd = qtd;
        produto = umProd;
    }

    public double getValor() {
        return produto.getPreco() * qtd;
    }

    @Override
    public String toString() {
        return String.format("%d   %s", qtd, produto);
    }
}
