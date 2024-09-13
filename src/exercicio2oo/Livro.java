package exercicio2oo;

public class Livro {
    public String titulo;
    public String autor;
    public  String genero;
    public boolean disponivel;

    public Livro(String titulo, String autor, String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        this.disponivel=true;
    }
    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("Livro emprestado!");
        }else{
            System.out.println("Livro não disponivel!");
        }
    }
    public void devolver(){
        disponivel=true;
        System.out.println("Livro devolvido!");
    }
    public boolean verificarDisponibilidade(){
        return disponivel;
    }
}
