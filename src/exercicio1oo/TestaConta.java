package exercicio1oo;

public class TestaConta {
    public static void main (String[]args){
        ContaBancaria contaMari = new ContaBancaria("2016","Mari");
        contaMari.depositar(500);
        contaMari.sacar(100);
        System.out.println("Saldo de Mari é: "+contaMari.consultarSaldo());
        contaMari.sacar(500);
        System.out.println("O saldo de Mari é: "+contaMari.consultarSaldo());

        ContaBancaria contaAna = new ContaBancaria("2016","Mari");
        contaAna.depositar(500);
        contaAna.sacar(100);
        System.out.println("Saldo de Ana é: "+ contaAna.consultarSaldo());
        contaAna.sacar(300);
        System.out.println("O saldo de Ana é: "+ contaAna.consultarSaldo());
    }
}
