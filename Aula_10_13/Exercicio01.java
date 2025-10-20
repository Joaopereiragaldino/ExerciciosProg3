public class Exercicio01 {
    public static void main(String[] args) 
    {
        System.out.println("Imprimindo os trita primeiros elementos do Fibonacci:");
        int x = 30; 
        int anterior = 1; // Primeiro numero da serie
        int atual = 1; // Segundo numero da serie
        int valorFuturo = 0;
        int i = 1;
        if(x == 0 || x == 1){
            System.out.printf("Fibonacci: %d", x);
        }

        System.out.println("Fibonacci: ");
        while(i <= x){
            System.out.println(anterior);
            valorFuturo = anterior + atual;
            anterior = atual;
            atual = valorFuturo;
            i++;
        }

        
    }
}
