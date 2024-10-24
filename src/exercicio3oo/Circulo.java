package exercicio3oo;

public class Circulo {
    private float raio;
    private String nome;

    public Circulo() {
        this.raio = 0;
        this.nome = "";
    }


    public Circulo(float raio, String nome) {
        this(); // Chama o construtor padrão
        setRaio(raio);
        setNome(nome);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
        if (raio < 0) {
            System.out.println("O raio não pode ser negativo: " + raio);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularDiametro() {
        return (raio >= 0) ? 2 * this.raio : 0;
    }

    public float calcularPerimetro() {
        return (raio >= 0) ? 2 * (float) Math.PI * this.raio : 0;
    }

    public float calcularArea() {
        return (raio >= 0) ? (float) Math.PI * this.raio * this.raio : 0;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", nome='" + nome + '\'' +
                ", diametro=" + calcularDiametro() +
                ", perimetro=" + calcularPerimetro() +
                ", area=" + calcularArea() +
                '}';
    }
}
