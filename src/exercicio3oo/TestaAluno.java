package exercicio3oo;

public class TestaAluno {
    public static void main(String[] args) {
        // Testando o construtor padrão e os setters
        Aluno mari = new Aluno();
        mari.setNome("Marileia");
        mari.setIdade(38);
        mari.setN1(8);
        mari.setN2(8);
        mari.setN3(9);
        mari.setN4(9);
        System.out.println(mari.toString());  // Usando o toString
        mari.imprimirSituacao();

        // Testando o construtor com parâmetros
        Aluno ana = new Aluno("Ana", 19, 0, 9, 8, 8);
        System.out.println(ana.toString());  // Usando o toString
        ana.imprimirSituacao();
    }
}
