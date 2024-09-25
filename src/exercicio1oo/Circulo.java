package exercicio1oo;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * (double) Math.PI * raio;
    }

    public double calcularArea() {
        return (double) Math.PI * raio * raio;
    }
}


