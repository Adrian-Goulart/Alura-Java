package CalcularPrecoProduto;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        livro.CalcularPrecoFinal();
        produto.CalcularPrecoFinal();
    }
}
