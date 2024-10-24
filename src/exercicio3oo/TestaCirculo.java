package exercicio3oo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(7, "Círculo A");
        System.out.println(circulo1.toString());

        Circulo circulo2 = new Circulo(-5, "Círculo B"); // Tentativa com raio negativo
        System.out.println(circulo2.toString());
    }
}
