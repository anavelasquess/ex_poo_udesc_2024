package exercicio1oo;

public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public int velocidade;

    public  Carro(String modelo,String marca, int ano){
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.velocidade=0;

    }
    public void acelerar(){
        velocidade+=10;
    }

    public void frear(){
        velocidade=Math.max(0,velocidade-10);

    }
    public int exibirVelocidade() {
        return velocidade;
    }
}
