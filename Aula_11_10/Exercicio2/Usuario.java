package Aula_11_10.Exercicio2;

public class Usuario {
    public enum NiveldeAcesso {BASICO, INTERMEDIARIO, ADMIN};
    private String nome;
    private NiveldeAcesso nivel_de_acesso;

    public Usuario(String anome, NiveldeAcesso aacesso){
        nome = anome;
        nivel_de_acesso = aacesso;
    }

    public String getNome(){
        return nome;
    }

    public NiveldeAcesso getNiveldeAcesso(){
        return nivel_de_acesso;
    }

    public void setNome(String anome){
        nome = anome;
    }

    public void setNiveldeAcesso(NiveldeAcesso aNiveldeAcesso){
        nivel_de_acesso = aNiveldeAcesso;
    }

    public void Mensagem(Usuario u1){
        if(u1.getNiveldeAcesso() == NiveldeAcesso.BASICO){
            System.out.println("Você possui privilégio básico");
        } else if(u1.getNiveldeAcesso() == NiveldeAcesso.INTERMEDIARIO){
            System.out.println("Você possui privilégio intermediário");
        } else if(u1.getNiveldeAcesso() == NiveldeAcesso.ADMIN){
            System.out.println("Você possui privilégio foda");
        } else {
            System.out.println("[ERRO] Inválido");
        }
    }
}
