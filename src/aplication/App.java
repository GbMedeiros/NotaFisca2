package aplication;

import entidades.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        ArrayList<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(new Cliente("Donald", 345)).inserir(new ItemVenda(2, new Produto(123213, "Oreo", 3.50))));

        for (Venda vends : vendas) {
            System.out.println(vends);
        }

        Venda v3 = new Venda(new Cliente("Pateta", 004));

        v3.inserir(new ItemVenda(4, new Produto(12345, "Bolacha Trakinas", 3.00)));
        System.out.println(v3.toString());

        /*
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Gabriel", 001));
        clientes.add(new Cliente("Mickey", 002));
        clientes.add(new Cliente("Pluto", 003));

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(4567899, "Laranja", 0.66));
        produtos.add(new Produto(9276545, "Guarana lata", 4.50));
        produtos.add(new Produto(1234564, "Bombom Ouro Branco", 2.50));


        ArrayList<ItemVenda> itven = new ArrayList<>();
        //itven.add(new ItemVenda(5,produtos.get(0)));
        //itven.add(new ItemVenda(2,produtos.get(1)));
        itven.add(new ItemVenda(7, produtos.get(2)));

        ArrayList<ItemVenda> itvend2 = new ArrayList<>();
        itvend2.add(new ItemVenda(4, produtos.get(2)));




        Venda v1 = new Venda(clientes.get(0));
        v1.inserir(new ItemVenda(5, produtos.get(0)));
        v1.inserir(new ItemVenda(1, produtos.get(1)));


        Venda v2 = new Venda(clientes.get(1));
        v2.inserir(new ItemVenda(2, produtos.get(1)));

*/


        /*


            v1.inserir(5, produtos.get(0));
            v1.inserir(2, produtos.get(1));
            v1.inserir(7, produtos.get(2));

            System.out.println(v1.toString());
            System.out.println("____________________");
            System.out.println(v2.toString());
        CadCliente cad1 = new CadCliente();
        System.out.println(cad1.exite(clientes, new Cliente("Gabriel", 1)));
        */
    }
}
