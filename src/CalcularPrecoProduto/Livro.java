package CalcularPrecoProduto;

// Com taxa adicional.

public class Livro implements Calculavel{
    double preco = 34.99;
    double taxa = 0.15;

    @Override
    public void CalcularPrecoFinal() {
        double valor = preco * taxa;
        double precoFinal = preco + valor;
        System.out.println("O preço final é R$:" + precoFinal);
    }
}
