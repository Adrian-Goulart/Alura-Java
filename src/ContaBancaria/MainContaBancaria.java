package ContaBancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaUm = new ContaBancaria(9841, 25631);
        ContaBancaria contaDois = new ContaBancaria(6432, 38525);
        ContaBancaria contaTres = new ContaBancaria(4521, 43798);
        ContaBancaria contaQuatro = new ContaBancaria(2578, 67523);
        ContaBancaria contaCinco = new ContaBancaria(6257, 14520);
        ContaBancaria contaSeis = new ContaBancaria(9082, 9123);

        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
        contasBancarias.add(contaUm);
        contasBancarias.add(contaDois);
        contasBancarias.add(contaTres);
        contasBancarias.add(contaQuatro);
        contasBancarias.add(contaCinco);
        contasBancarias.add(contaSeis);

        ContaBancaria contaMaiorSaldo = contasBancarias.get(0);
        for (ContaBancaria item : contasBancarias) {
            if (item.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = item;
            }
        }
        contaMaiorSaldo.informacoes();
    }
}
