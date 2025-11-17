package Aula_11_17.Questao2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Questao2 {
    
    public static int calcularRaiz(int numero)
    throws IllegalArgumentException
    {
        if(numero < 0)
        {
            throw new IllegalArgumentException();
        }
        int raiz = (int) Math.sqrt(numero);
        return raiz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do{
            try {
                System.out.println("Entre com um número: ");
                int a = scanner.nextInt();
                int resultado = calcularRaiz(a);
                System.out.printf("O resultado da raiz quadrada de %d = %d", a, resultado);
                flag = false;
            } 
            catch(IllegalArgumentException e)
            {
                System.err.printf("\nException: " + e);
                scanner.nextLine();
                System.out.println(" Entre com numeros inteiros positivos.");
            }
        }
        while(flag);
    scanner.close();
    }
}
