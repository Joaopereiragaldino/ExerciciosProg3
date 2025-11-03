package Aula_11_03.Questao1;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(){
        this.titulo = "Não inicializado";
        this.autor = "Não inicializado";
    }

    public Livro(String atitulo, String aautor){
        this.titulo = atitulo;
        this.autor = aautor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }


    public void ExibirDados(){
        System.out.println("Dados do Livro: ");
        System.out.print("Autor:");
        System.out.println(this.autor);
        System.out.print("Titulo:");
        System.out.println(this.titulo);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("O caminho do mal", "Pedro");

        l1.ExibirDados();
        l2.ExibirDados();
        
    }
}
