package Aula_11_17.Questao3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com uma numero inteiro: ");
        String user = scanner.nextLine();
        try{
            int result = Integer.parseInt(user);
            System.out.printf("Sua string \"%s\" foi transformada para inteiro com sucesso = %d", user, result);
        }
        catch(NumberFormatException e){
            System.err.print("Não entre com letras.\n");
        }
        finally{
            System.out.println("\nEncerrando o programa.");
            }   
    scanner.close();
    }
}
