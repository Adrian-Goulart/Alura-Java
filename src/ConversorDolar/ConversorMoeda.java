package ConversorDolar;

// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
// com o metodo converterDolarParaReal() para converter um valor em dólar para reais.
// A classe deve receber o valor em dólar como parâmetro.


public class ConversorMoeda implements ConversaoFinanceira {
  //  double dolar;

    @Override
    public void converterDolarParaReal(double dolar) {
        // Cotação do dólar 27 de out. 2025
        double cotacaoDolar = 5.38;
        double valorReal = dolar * cotacaoDolar;
        // System.out.println("O valor %f dólares em reais é: R$%f".formatted(dolar, valorReal));
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
