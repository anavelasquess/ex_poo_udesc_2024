package exercicio3oo;

public class Livros {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    // Construtor sem argumentos
    public Livros() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.genero = "Desconhecido";
        this.disponivel = true;
    }

    // Construtor com parâmetros
    public Livros(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado: " + this.titulo);
        } else {
            System.out.println("Livro não disponível para empréstimo: " + this.titulo);
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Livro devolvido: " + this.titulo);
        } else {
            System.out.println("Livro não estava emprestado: " + this.titulo);
        }
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}