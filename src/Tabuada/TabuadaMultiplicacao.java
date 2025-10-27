package Tabuada;

// Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada
// com o metodo mostrarTabuada() para exibir a tabuada de um número.
// A classe deve receber o número como parâmetro.


public class TabuadaMultiplicacao implements TabuadaInterface{
    @Override
    public void MostrarTabuada(double num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("%.2f * %d = %.2f".formatted(num, i, num * i));
        }
    }
}
