package exercicio2oo;

import exercicio2oo.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno mari = new Aluno();
        mari.setNome("Marileia");
        mari.setIdade(38);
        mari.setN1(8);
        mari.setN2(8);
        mari.setN3(9);
        mari.setN4(9);
        System.out.println("A média do aluno " + mari.getNome() + " que tem " + mari.getIdade() + " anos é " + mari.calcularMedia());
        mari.imprimirSituacao();

        Aluno ana = new Aluno();
        ana.setNome("Ana");
        ana.setIdade(19);
        ana.setN1(9);
        ana.setN2(9);
        ana.setN3(8);
        ana.setN4(8);
        System.out.println("A média do aluno " + ana.getNome() + " que tem " + ana.getIdade() + " anos é " + ana.calcularMedia());
        ana.imprimirSituacao();
    }
}
