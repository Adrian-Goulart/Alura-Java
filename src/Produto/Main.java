package Produto;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto = new Produto("Arroz", 45.99, 60);

        Produto produtoDois = new Produto("Cereal", 22.99, 40);

        Produto produtoTres = new Produto("Biscoito", 3.50, 35);

        listaProdutos.add(produto);
        listaProdutos.add(produtoDois);
        listaProdutos.add(produtoTres);

        System.out.println("_______________________________________");
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        int indice = 2;
        System.out.println("Índice: " + indice + " -> " + listaProdutos.get(indice).getNome());
        System.out.println("_______________________________________");
        System.out.println(listaProdutos.toString());


        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Carne", 79.99, 100, "22/11/25");
        ProdutoPerecivel produtoPerecivelDois = new ProdutoPerecivel("Bolo", 29.99, 5, "20/11/25");
        ProdutoPerecivel produtoPerecivelTres = new ProdutoPerecivel("Miojo", 14.99, 15, "20/12/25");

        ArrayList<ProdutoPerecivel> listaProdutoPerecivel = new ArrayList<>();
        listaProdutoPerecivel.add(produtoPerecivel);
        listaProdutoPerecivel.add(produtoPerecivelDois);
        listaProdutoPerecivel.add(produtoPerecivelTres);
        System.out.println("_______________________________________");
        System.out.println(listaProdutoPerecivel.toString());
    }
}
