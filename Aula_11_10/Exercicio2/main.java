package Aula_11_10.Exercicio2;

public class main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Eduardo", Usuario.NiveldeAcesso.BASICO);
        Usuario user2 = new Usuario("Pedro", Usuario.NiveldeAcesso.INTERMEDIARIO);
        Usuario user3 = new Usuario("Kreber", Usuario.NiveldeAcesso.ADMIN);

        user1.Mensagem(user1);
        user2.Mensagem(user2);
        user3.Mensagem(user3);
        
    }
}
