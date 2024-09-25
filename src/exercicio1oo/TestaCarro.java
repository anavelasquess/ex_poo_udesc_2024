package exercicio1oo;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carroMari = new Carro("208", "Peugeot", 2022);
        carroMari.acelerar();
        carroMari.acelerar();
        carroMari.exibir();

        carroMari.acelerar();
        carroMari.acelerar();
        carroMari.frear();
        carroMari.exibir();

        Carro carroAna = new Carro("Civic", "Honda", 2022);
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.exibir();

        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.acelerar();
        carroAna.frear();
        carroAna.exibir();
    }
}
