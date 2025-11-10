package Aula_11_10.Exercicio3;

public class Triatleta implements Corredor, Nadador, Ciclista{

    private String nome;
    private int numero;

    public Triatleta(String anome, int anumero){
        nome = anome;
        numero = anumero;
    }

    @Override
    public void Correr(){
        System.out.println("O atleta " + nome + " está correndo.");
    }

    @Override 
    public void Nadar(){
        System.out.println("O atleta " + nome + " está nadando.");
    }
    
    @Override
    public void Pedalar(){
        System.out.println("O atleta " + nome + " está pedalando.");
    }
    
}
