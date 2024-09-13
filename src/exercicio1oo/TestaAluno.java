package exercicio1oo;

public class TestaAluno {
    public static void main (String[]arg){
        Aluno mari = new Aluno();
        mari.nome="Marileia ";
        mari.idade=38;
        mari.n1=8;
        mari.n2=8;
        mari.n3=9;
        mari.n4=9;
        double media= mari.calcularMedia();
        System.out.println("A media do aluno "+mari.nome+" que tem "+mari.idade+" anos é");
        mari.imprimirSituacao();

        Aluno ana = new Aluno();
        ana.nome="Ana ";
        ana.idade=19;
        ana.n1=9;
        ana.n2=9;
        ana.n3=8;
        ana.n4=8;
        media= ana.calcularMedia();
        System.out.println("A media do aluno "+ ana.nome+" que tem "+ ana.idade+" anos");
        ana.imprimirSituacao();

    }
}
