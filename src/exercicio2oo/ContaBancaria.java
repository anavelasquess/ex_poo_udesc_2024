package exercicio2oo;

public class ContaBancaria {
    private String numero;
    private String titular;
    private float saldo;

    // Construtor
    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    // Métodos
    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public float consultarSaldo() {
        return this.saldo;
    }
}