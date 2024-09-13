package exercicio2oo;

import exercicio1oo.Circulo;

public class TestaCirculo {
    public static void main (String[]args){
        exercicio1oo.Circulo circulo = new Circulo(7);
        System.out.println("O diâmetro é "+circulo.calcularDiametro());
        System.out.println("O perímetro é "+circulo.calcularPerimetro());
        System.out.println("A área é "+circulo.calcularArea());
    }
}
