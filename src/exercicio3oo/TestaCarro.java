package exercicio3oo;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carroMari = new Carro("208", "Peugeot", 2022);
        carroMari.acelerar();
        carroMari.acelerar();
        System.out.println("A velocidade do carro de Mari é: " + carroMari.exibirVelocidade());
        carroMari.acelerar();
        carroMari.acelerar();
        carroMari.frear();
        System.out.println("A velocidade do carro de Mari após frear é: " + carroMari.exibirVelocidade());
        System.out.println(carroMari);

        Carro carroAna = new Carro("Civic", "Honda", 2022);
        carroAna.acelerar();
        carroAna.acelerar();
        System.out.println("A velocidade do carro de Ana é: " + carroAna.exibirVelocidade());
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.frear();
        System.out.println("A velocidade do carro de Ana após frear é: " + carroAna.exibirVelocidade());
        System.out.println(carroAna);

        Carro carroJoao = new Carro("Fusca", "Volkswagen", 1975);
        carroJoao.acelerar();
        carroJoao.frear();
        System.out.println("A velocidade do carro de João após frear (sem acelerar) é: " + carroJoao.exibirVelocidade());

        carroJoao.acelerar();
        carroJoao.acelerar();
        carroJoao.frear();
        carroJoao.frear();
        System.out.println("A velocidade do carro de João após duas freadas é: " + carroJoao.exibirVelocidade());


        System.out.println("Tentando definir a velocidade negativa:");
        carroJoao.setVelocidade(-20);
        System.out.println("A velocidade do carro de João permanece: " + carroJoao.exibirVelocidade());

        System.out.println(carroJoao);
    }
}
