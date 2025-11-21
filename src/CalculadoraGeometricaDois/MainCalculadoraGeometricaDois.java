package CalculadoraGeometricaDois;

public class MainCalculadoraGeometricaDois {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.calcularArea(7);
        System.out.println("-------------------");
        Circulo circulo = new Circulo();
        circulo.calcularArea(4);
    }
}
