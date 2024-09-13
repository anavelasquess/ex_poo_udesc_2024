package exercicio2oo;

public class Retangulo {
    public float largura;
    public float altura;


    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float calcularArea() {
        return largura*altura;
    }
}