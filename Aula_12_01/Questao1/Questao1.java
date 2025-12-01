package Aula_12_01.Questao1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Questao1 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um nome para o arquivo: ");
        String a = scanner.nextLine();

        try(InputStream is = new FileInputStream(a + ".txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr)
        ) 
        {
            System.out.println("Lendo o arquivo");

            String s = br.readLine();
        
            while(s != null){
                System.out.println(s);
                s = br.readLine();
            }
            System.out.println("Fim do arquivo");
            br.close();
        } 
        catch (FileNotFoundException e) {
            System.err.println("O arquivo não foi encontrado");
            e.printStackTrace();
        } finally{
            scanner.close();
        }
    }
}
