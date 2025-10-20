public class Contador {
    public static int totalObjetos;
    public Contador(){
        totalObjetos++;
    }

    public static void mostrarTotal(){
        System.out.println("Total de objetos = " + totalObjetos);
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        c.mostrarTotal();
        Contador c1 = new Contador();
        c1.mostrarTotal();
        Contador c2 = new Contador();
        c2.mostrarTotal();
    }
}
