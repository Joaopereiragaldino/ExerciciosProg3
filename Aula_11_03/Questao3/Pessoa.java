package Aula_11_03.Questao3;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "Não inicializado";
        this.idade = -1;
    }

    public Pessoa(String anome, int aidade){
        this.nome = anome;
        if(aidade < 0){
            this.idade = -1;
        } else {
            this.idade = aidade;
        }
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String anome){
        this.nome = anome;
    }

    public void setIdade(int aidade){
        this.idade = aidade;
    }

static public class Aluno extends Pessoa{

    private String matricula;

    public String getMatricula(){
        return matricula;
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public Aluno(String anome, int aidade, String amatricula){
        super(anome, aidade);
        this.matricula = amatricula;
    }

    public void ExibirDados(Aluno a1){
        System.out.println("Dados do aluno:");
        System.out.print("Nome: ");
        System.out.println(a1.getNome());
        System.out.print("Idade: ");
        System.out.println(a1.getIdade());
        System.out.print("Matricula: ");
        System.out.println(a1.getMatricula());
        }    
}
public static void main(String[] args) {
    Aluno a1 = new Aluno("Kleber", 5, "Matriculado");
    Aluno a2 = new Aluno("Junior", 10, "Não Matriculado");

    a1.ExibirDados(a1); 
    a2.ExibirDados(a2);  
}
}


