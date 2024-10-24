package exercicio3oo;

import java.util.Scanner;

public class TestaLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livros livroMari = new Livros("Todas as suas (im)perfeições", "Collen Hoover", "Romance");
        Livros livroAna = new Livros("A biblioteca da Meia-Noite", "Matt Haig", "Ficção Científica");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Verificar disponibilidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro a ser emprestado (1 - Mari, 2 - Ana): ");
                    int escolhaEmprestimo = scanner.nextInt();
                    if (escolhaEmprestimo == 1) {
                        livroMari.emprestar();
                    } else if (escolhaEmprestimo == 2) {
                        livroAna.emprestar();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o título do livro a ser devolvido (1 - Mari, 2 - Ana): ");
                    int escolhaDevolucao = scanner.nextInt();
                    if (escolhaDevolucao == 1) {
                        livroMari.devolver();
                    } else if (escolhaDevolucao == 2) {
                        livroAna.devolver();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o título do livro para verificar a disponibilidade (1 - Mari, 2 - Ana): ");
                    int escolhaDisponibilidade = scanner.nextInt();
                    if (escolhaDisponibilidade == 1) {
                        System.out.println("Disponibilidade: " + livroMari.isDisponivel());
                    } else if (escolhaDisponibilidade == 2) {
                        System.out.println("Disponibilidade: " + livroAna.isDisponivel());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
