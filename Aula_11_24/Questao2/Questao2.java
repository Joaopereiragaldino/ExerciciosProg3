package Aula_11_24.Questao2;

import java.util.*;

public class Questao2 {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String a;
        do { 
            System.out.println("Insira uma String");
            a = scanner.nextLine();
            lista.add(a);
        } while (!(a.equals("fim")));

        scanner.close();
        System.out.println("Imprimindo o HashSet: ");
        for(String texto: lista){
            System.out.println(texto);
        }

        Boolean temJava = lista.contains("Java");
        System.out.println("Na lista tem a palavra Java? " + temJava);

    }
}
