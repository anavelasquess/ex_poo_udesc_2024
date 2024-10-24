package exercicio3oo;

import exercicio2oo.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 5);
        System.out.println("A área é: " + retangulo.calcularArea());
    }
}