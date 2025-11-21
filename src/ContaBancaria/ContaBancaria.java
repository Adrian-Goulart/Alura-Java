package ContaBancaria;

public class ContaBancaria {
    private int id;
    private double saldo;

    public ContaBancaria (int Id, double Saldo) {
        this.id = Id;
        this.saldo = Saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void informacoes() {
        System.out.println("ID: " + id);
        System.out.println("Saldo: " + saldo);
    }
}