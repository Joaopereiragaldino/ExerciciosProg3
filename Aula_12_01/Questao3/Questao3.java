package Aula_12_01.Questao3;

import java.io.File;
import java.util.*;

public class Questao3 {
    
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        File arquivo = new File(entrada + ".txt");

        System.out.println("Verificando arquivo");

        if(arquivo.exists()){

            // Verifica se é um arquivo
            if(arquivo.isFile()){
                System.out.println("O nome que o usuario passou é um arquivo");
            } else if(arquivo.isDirectory()){
                System.out.println("O nome que o usuario passou é um diretorio");
            } 
            
            System.out.println("Tamanho do arquivo em bytes: " + arquivo.length() + " bytes");
            System.out.println("O caminho absoluto do arquivo: " + arquivo.getAbsolutePath());
            
        } 
        else {
            System.out.println("O nome que o usuario passou não existe");
        }

        scanner.close();

    }
}
