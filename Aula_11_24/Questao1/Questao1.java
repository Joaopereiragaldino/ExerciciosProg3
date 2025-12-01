package Aula_11_24.Questao1;

import java.util.*;

public class Questao1 {
    
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;
        double mediaF = 0.0;
        for(int i = 0 ; i < 10 ; i++){
            System.out.print("Entre com um número inteiro: ");
            int entrada = scanner.nextInt();
            numeros.add(entrada);
            somaTotal+= entrada;
        }
        
        scanner.close();
        // Calculando a media dos elementos do ArrayList
        mediaF = somaTotal/ numeros.size();

        // Exibindo todos os numeros do ArrayList
        for(int number: numeros){
            System.out.println(number);
        }
        
        // Usando removeif()
        numeros.removeIf(t -> t % 2 == 0);

        System.out.printf("A soma total dos elementos do array = %d \nMedia de todos os elementos do arrayList = %.2f%n", somaTotal, mediaF);

        // Exibindo todos os numeros do ArrayList
        System.out.println("Array sem numeros pares");
        for(int number: numeros){
            System.out.println(number);
        }
    }
}
