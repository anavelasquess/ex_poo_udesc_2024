package exercicio3oo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5, 5);
        System.out.println(retangulo1.toString());

        Retangulo retangulo2 = new Retangulo(-3, 4); // Tentativa com largura negativa
        System.out.println(retangulo2.toString());

        Retangulo retangulo3 = new Retangulo(7, -10); // Tentativa com altura negativa
        System.out.println(retangulo3.toString());

        // Testando setters com valores negativos
        retangulo2.setLargura(-10); // Tentativa de definir largura negativa
        retangulo2.setAltura(7); // Definindo altura positiva
        System.out.println(retangulo2.toString());
    }
}
