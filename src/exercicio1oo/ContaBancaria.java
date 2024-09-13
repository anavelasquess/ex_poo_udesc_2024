package exercicio1oo;

public class ContaBancaria {
    public String numero;
    public String titular;
    public float saldo;

    public ContaBancaria(String numero,String titular){
        this.numero=numero;
        this.titular=titular;
        this.saldo=0;
    }
    public void depositar(float valor){
        saldo+=valor;
    }
    public void sacar(float valor){
        if(saldo>=valor){
            saldo -=valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public float consultarSaldo(){
        return saldo;
    }
}
