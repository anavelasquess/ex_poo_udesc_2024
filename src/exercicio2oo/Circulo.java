package exercicio2oo;

public class Circulo {
    public float raio;
    public Circulo(float raio){
        this.raio=raio;
    }
    public float calcularDiametro(){
        return 2 * raio;
    }
    public float calcularPerimetro(){
        return 2*(float)Math.PI*raio;
    }
    public float calcularArea(){
        return (float)Math.PI*raio*raio;
    }
}


