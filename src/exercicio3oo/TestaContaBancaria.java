package exercicio3oo;

import exercicio3oo.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        exercicio2oo.ContaBancaria contaMari = new exercicio2oo.ContaBancaria("2016", "Mari");
        contaMari.depositar(500);
        contaMari.sacar(100);
        System.out.println("Saldo de Mari é: " + contaMari.consultarSaldo());
        contaMari.sacar(500);
        System.out.println("O saldo de Mari é: " + contaMari.consultarSaldo());

        exercicio3oo.ContaBancaria contaAna = new ContaBancaria("2024", "Ana");
        contaAna.depositar(500);
        contaAna.sacar(100);
        System.out.println("Saldo de Ana é: " + contaAna.consultarSaldo());
        contaAna.sacar(300);
        System.out.println("O saldo de Ana é: " + contaAna.consultarSaldo());
    }
}