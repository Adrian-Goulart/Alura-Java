package CalculadoraGeometricaDois;

public class Quadrado implements Forma{
    @Override
    public void calcularArea(double lado) {
        System.out.println(lado *= lado);
    }
}
