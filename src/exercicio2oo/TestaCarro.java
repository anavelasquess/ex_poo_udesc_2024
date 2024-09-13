package exercicio2oo;

import exercicio1oo.Carro;

public class TestaCarro {
    public static void main (String[]args){
        exercicio1oo.Carro carroMari = new exercicio1oo.Carro("208","Peugeot",2022);
        carroMari.acelerar();
        carroMari.acelerar();
        System.out.println("A velocidade do carro de Mari é: "+carroMari.exibirVelocidade());
        carroMari.acelerar();
        carroMari.acelerar();
        carroMari.frear();
        System.out.println("A velocidade do carro de Mari é: "+carroMari.exibirVelocidade());
        exercicio1oo.Carro carroAna = new Carro("Civic","Honda",2022);
        carroAna.acelerar();
        carroAna.acelerar();
        System.out.println("A velocidade do carro de Ana é: "+ carroAna.exibirVelocidade());
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.frear();
        System.out.println("A velocidade do carro de Ana é: "+ carroAna.exibirVelocidade());

    }
}
