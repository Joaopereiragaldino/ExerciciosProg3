package Aula_12_01.Questao2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Questao2 {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("saida.txt");
        while(s.hasNextLine()){
            String linha = s.nextLine();
            if(linha.equals("FIM")){
                break;
            }
            ps.println(linha);
        }
        ps.close(); // Fechando o arquivo depois da escrita
        s.close(); // Fechando o scanner 
        System.out.println("Final da escrita");    
    }
}
