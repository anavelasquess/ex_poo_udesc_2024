package exercicio1oo;

public class TestaCarro {
    public static void main (String[]args){
        Carro carroMari = new Carro("208","Peugeot",2022);
        carroMari.acelerar();
        carroMari.acelerar();
        System.out.println("A velocidade do carro de Mari é: "+carroMari.exibirVelocidade());
        carroMari.acelerar();
        carroMari.acelerar();
        carroMari.frear();
        System.out.println("A velocidade do carro de Mari é: "+carroMari.exibirVelocidade());
        Carro carroAna = new Carro("Civic","Honda",2022);
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
