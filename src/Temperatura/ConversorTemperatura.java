package Temperatura;

// Crie uma interface ConversorTemperaturaPadrao com os métodos celsiusParaFahrenheit()
// e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperatura que implementa
// essa interface com as fórmulas de conversão e exibe os resultados.


public class ConversorTemperatura implements ConversorTemperaturaPadrao{

    @Override
    public void CelsiusParafahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    @Override
    public void FahrenheitParaCelcius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
