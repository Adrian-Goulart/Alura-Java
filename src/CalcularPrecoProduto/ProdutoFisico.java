package CalcularPrecoProduto;

// Com desconto

public class ProdutoFisico implements Calculavel{
    double preco = 50;
    double desconto = 0.25;

    @Override
    public void CalcularPrecoFinal() {
        double valorDesconto = preco * desconto;
        double precoFinal = preco - valorDesconto;
        System.out.println("O preço final é R$:" + precoFinal);
    }
}