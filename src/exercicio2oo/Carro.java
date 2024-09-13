package exercicio2oo;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private int velocidade;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        this.velocidade = Math.max(0, this.velocidade - 10);
    }

    public int exibirVelocidade() {
        return this.velocidade;
    }
}