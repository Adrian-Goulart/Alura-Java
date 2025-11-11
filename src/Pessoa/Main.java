package Pessoa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome("Adrian");
        pessoaUm.setIdade(18);

        Pessoa pessoaDois = new Pessoa();
        pessoaDois.setNome("Kauã");
        pessoaDois.setIdade(18);

        Pessoa pessoaTres = new Pessoa();
        pessoaTres.setNome("Lucas");
        pessoaTres.setIdade(18);

        listaPessoas.add(pessoaUm);
        listaPessoas.add(pessoaDois);
        listaPessoas.add(pessoaTres);

        System.out.println("Tamanho da lista: " + listaPessoas.size());

        System.out.println("Primeira pessoa: " + listaPessoas.get(0));
        System.out.println("Lista completa: " + listaPessoas);
    }
}
