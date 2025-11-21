package ProdutoDois;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MainProdutoDois {
        public static void main(String[] args) {
                ProdutoDois produtoA = new ProdutoDois("Livro", 59.99);
            ProdutoDois produtoB = new ProdutoDois("Óleo", 20);
            ProdutoDois produtoC = new ProdutoDois("Pente de Ovos", 12);
            ProdutoDois produtoD = new ProdutoDois("Pirulito", 1.50);
            ProdutoDois produtoE = new ProdutoDois("Creme", 15.99 );

            ArrayList<ProdutoDois> produtos = new ArrayList<>();
            produtos.add(produtoA);
            produtos.add(produtoB);
            produtos.add(produtoC);
            produtos.add(produtoD);
            produtos.add(produtoE);

            double preco = 0;
            for ( ProdutoDois item : produtos) {
                preco += item.getPreco();
            }
            double resultado = preco / produtos.size();
            System.out.println("Resultado: " + resultado);
        }
}
