package ProdutoDois;

public class ProdutoDois {
    private String nome;
    private double preco;

    public ProdutoDois (String Nome, double Preco) {
        this.nome = Nome;
        this.preco = Preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
