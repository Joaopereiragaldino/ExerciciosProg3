import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("João Marcello Galdino Pereira");
        list.add("Kleber Baiano");
        list.add("Vinícius");
        list.add("Pedro");
        list.add("Gabriel");
        // Imprimindo a lista com os 5 elementos
        Iterator i = list.iterator();
        String c;
        System.out.println("List: ");
        while(i.hasNext()){
            c = (String)i.next();
            System.out.println(c);
        }
        
        // Imprimindo a lista com 4 elementos
        list.remove(4);
        System.out.println("Nova List: ");
        Iterator i2 = list.iterator();
        String c2;
        while(i2.hasNext()){
            c2 = (String)i2.next();
            System.out.println(c2);
        }
    }
    
}
