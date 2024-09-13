package exercicio2oo;

public class Circulo {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularDiametro() {
        return 2 * this.raio;
    }

    public float calcularPerimetro() {
        return 2 * (float) Math.PI * this.raio;
    }

    public float calcularArea() {
        return (float) Math.PI * this.raio * this.raio;
    }
}