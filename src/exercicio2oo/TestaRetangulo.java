package exercicio2oo;

import exercicio1oo.Retangulo;

public class TestaRetangulo {
    public static void main(String[]args){
        exercicio1oo.Retangulo retangulo =new Retangulo(5,5);
        System.out.println("a área é: "+retangulo.calcularArea());
    }
}
