package exercicio3oo;

public class Aluno {
    private String nome;
    private int idade;
    private double n1, n2, n3, n4;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com todos os parâmetros
    public Aluno(String nome, int idade, double n1, double n2, double n3, double n4) {
        this.nome = nome;
        this.idade = idade;
        setN1(n1);
        setN2(n2);
        setN3(n3);
        setN4(n4);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        if (n1 >= 0 && n1 <= 10) {
            this.n1 = n1;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        if (n2 >= 0 && n2 <= 10) {
            this.n2 = n2;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        if (n3 >= 0 && n3 <= 10) {
            this.n3 = n3;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        if (n4 >= 0 && n4 <= 10) {
            this.n4 = n4;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public void imprimirSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " está aprovado!");
        } else {
            System.out.println(nome + " está reprovado!");
        }
    }


    @Override
    public String toString() {
        return "Aluno: " + nome + ", Idade: " + idade + ", Notas: [" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + "]";
    }
}

