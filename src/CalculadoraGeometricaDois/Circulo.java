package CalculadoraGeometricaDois;

public class Circulo implements Forma{
    @Override
    public void calcularArea(double raio) {
        System.out.println(Math.PI * (Math.pow(raio, 2)));
    }
}
