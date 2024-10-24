package exercicio3oo;

public class ContaBancaria {
    private String numero;
    private String titular;
    private float saldo;

    // Construtor padrão
    public ContaBancaria() {
        this.numero = "";
        this.titular = "";
        this.saldo = 0;
    }

    // Construtor com parâmetros
    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

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

    public void depositar(float valor) {
        if (valor < 0) {
            System.out.println("O valor do depósito não pode ser negativo!");
            return;
        }
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (valor < 0) {
            System.out.println("O valor do saque não pode ser negativo!");
            return;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
