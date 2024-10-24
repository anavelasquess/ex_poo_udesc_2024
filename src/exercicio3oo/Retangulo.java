package exercicio3oo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
        if (largura < 0) {
            System.out.println("A largura não pode ser negativa: " + largura);
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if (altura < 0) {
            System.out.println("A altura não pode ser negativa: " + altura);
        }
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public String toString() {
        String areaStr = (largura >= 0 && altura >= 0) ? ", area=" + calcularArea() : "";
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                areaStr +
                '}';
    }
}
