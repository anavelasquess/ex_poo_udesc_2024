package exercicio1oo;

public class Livros {
    public String titulo;
    public String autor;
    public String genero;
    public boolean disponivel;

    public Livros(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Livro não disponível para empréstimo!");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("O livro já está disponível e não pode ser devolvido!");
        }
    }

    public boolean verificarDisponibilidade() {
        return disponivel;
    }
}
