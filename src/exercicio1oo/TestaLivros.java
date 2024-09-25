package exercicio1oo;

public class TestaLivros {
    public static void main(String[] args) {
        Livros livroMari = new Livros("Todas as suas (im)perfeições", "Collen Hoover", "Romance");

        System.out.println("Disponível: " + livroMari.verificarDisponibilidade());
        livroMari.emprestar();
        System.out.println("Disponível: " + livroMari.verificarDisponibilidade());
        livroMari.devolver();
        System.out.println("Disponível: " + livroMari.verificarDisponibilidade());


        livroMari.devolver();

        Livros livroAna = new Livros("A biblioteca da Meia-Noite", "Matt Haig", "Ficção Científica");

        System.out.println("Disponível: " + livroAna.verificarDisponibilidade());
        livroAna.emprestar();
        System.out.println("Disponível: " + livroAna.verificarDisponibilidade());
        livroAna.devolver();
        System.out.println("Disponível: " + livroAna.verificarDisponibilidade());

        livroAna.devolver();
    }
}
