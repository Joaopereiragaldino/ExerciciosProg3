package Aula_10_20;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int j;
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        Iterator i = lista.iterator();
        while(i.hasNext()){
            j = (int) i.next();
            System.out.println("Numeros da lista: "+ j);
        }
    }
}
