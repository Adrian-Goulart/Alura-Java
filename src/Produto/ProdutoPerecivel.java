package Produto;

public class ProdutoPerecivel extends Produto{

    String validade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }
}
