package entidades;

public class Venda {
    private Cliente cliente;
    //private ArrayList<ItemVenda> itemVendas;
    private ItemVenda itVenda;

    public Venda(Cliente clie) {
        cliente = clie;
    }

    public Venda inserir(ItemVenda itven) {
        this.itVenda = itven;
        return this;
    }

    /*
     public void inserir(int qtd, Produto produto){
        ItemVenda itemVenda = new ItemVenda(qtd, produto);
        itVenda.add(itemVenda);
    }*/
    public double valorTotal() {
        double total = 0;
        //for (ItemVenda it : itVenda){
        total += itVenda.getValor();
        return total;
    }

    //criar um for ïtvenda dentro do to string ou criar um metodo notafical;

    @Override
    public String toString() {
        return String.format("%s%n%sValor total: %.2f",cliente , itVenda, valorTotal());
    }

}
