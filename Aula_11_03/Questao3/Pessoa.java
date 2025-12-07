package Aula_11_03.Questao3;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "Não inicializado";
        this.idade = -1;
    }

    public Pessoa(String anome, int aidade) {
        this.nome = anome;
        if (aidade < 0) {
            this.idade = -1;
        } else {
            this.idade = aidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String anome) {
        this.nome = anome;
    }

    public void setIdade(int aidade) {
        this.idade = aidade;
    }

    static public class Aluno extends Pessoa {

        private String matricula;

        public Aluno(String anome, int aidade, String amatricula) {
            super(anome, aidade);
            this.matricula = amatricula;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String amatricula) {
            this.matricula = amatricula;
        }

        public void ExibirDados() {
            System.out.println("--- Dados do aluno ---");
            System.out.println("Nome: " + this.getNome()); 
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Matricula: " + this.getMatricula());
        }
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Kleber", 5, "Matriculado");
        
        a1.ExibirDados(); 

        System.out.println("\nAlterando nome e matrícula do Kleber...");
        a1.setNome("Kleber Silva");
        a1.setMatricula("Trancado");
        
        a1.ExibirDados();
    }
}
