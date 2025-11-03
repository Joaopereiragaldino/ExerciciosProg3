package Aula_11_03.Questao4;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {

    private String nome;
    
    public Animal(String anome){
        this.nome = anome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String anome){
        this.nome = anome;
    }

    public void emitirSom(){
        System.out.println("Som");
    }

static public class Cachorro extends Animal
{
    public Cachorro(String anome) 
    {
        super(anome);
    }
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuu");
    }    
}
static public class Gato extends Animal{
    public Gato(String anome){
        super(anome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
}
public static void main(String[] args) {
    Cachorro c1 = new Cachorro("Pastor alemão");
    Gato g1 = new Gato("Husky");
    Animal c = new Animal(null);

    ArrayList<Animal> lista = new ArrayList<Animal>();
    lista.add(c1);
    lista.add(g1);
    Iterator i = lista.iterator();
    System.out.println("Sons dos animais: ");
    while(i.hasNext()){
        c = (Animal)i.next();
        c.emitirSom();
    }
}
}
