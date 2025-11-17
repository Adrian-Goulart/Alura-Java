package Produto;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(45.99);
        produto.setQuantidade(60);

        Produto produtoDois = new Produto();
        produtoDois.setNome("Cereal");
        produtoDois.setPreco(22.99);
        produtoDois.setQuantidade(40);

        Produto produtoTres = new Produto();
        produtoTres.setNome("Biscoito");
        produtoTres.setPreco(3.50);
        produtoTres.setQuantidade(35);

        listaProdutos.add(produto);
        listaProdutos.add(produtoDois);
        listaProdutos.add(produtoTres);

        System.out.println("_______________________________________");
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        int indice = 2;
        System.out.println("Índice: " + indice + " -> " + listaProdutos.get(indice).getNome());
        System.out.println("_______________________________________");

        System.out.println(listaProdutos.toString());

    }
}
