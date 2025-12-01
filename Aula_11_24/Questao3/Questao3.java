package Aula_11_24.Questao3;

import java.util.*;

public class Questao3 {
    public static void main(String[] args) {
        Map<String,Integer> lista = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos nomes você deseja colocar: ");
        int entrada = scanner.nextInt();
        scanner.nextLine(); // Para limpar o buffer
        int idade;
        String nome;
        for(int i = 0 ; i < entrada ; i++){
            System.out.print("Entre com um nome: ");
            nome = scanner.nextLine();
            System.out.print("Entre com uma idade: ");
            idade = scanner.nextInt();
            lista.put(nome, idade);
            scanner.nextLine(); // Limpar o buffer
        }

        // Pedindo um nome para o usuario
        System.out.print("Insira um nome para realizar uma busca: ");
        String nomeUsuario = scanner.nextLine(); // Pegar a string
        boolean temNome = lista.containsKey(nomeUsuario); 
        
        
        // Terminar o codigo
    }
}
