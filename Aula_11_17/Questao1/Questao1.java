package Aula_11_17.Questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
    public static int divisao(int a, int b)
    throws ArithmeticException    
    {
        return a / b;
    }    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do { 
            try{
                System.out.print("Coloca o numerador da divisão: ");
                int a = scanner.nextInt();
                System.out.print("Coloca o denominador da divisão: ");
                int b = scanner.nextInt();

                int resultado = divisao(a,b);
                System.out.printf("\nResultado: %d / %d = %d\n", a, b, resultado);
                flag = false;
            }
            // Se tiver entradas invalidas (Independente da variavel (a ou b))
            catch(InputMismatchException inputMismatchException)
            {
                System.err.printf("Exception: %s\n", inputMismatchException);
                scanner.nextLine(); // Descarta a entrada do usuario
                System.out.println("Entre com números inteiros.");
            }
            // Somente denominador 0
            catch (ArithmeticException arithmeticException)
            {
                System.err.printf("Exception: %s\n", arithmeticException);
                scanner.nextLine(); // Descarta a entrada do usuário
                System.out.println("0 não pode ser denominador");
            }
        } while (flag);
        scanner.close();
    }

}
