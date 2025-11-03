package Aula_11_03.Questao5;

public class Calculadora {
    public void somar(int a, int b){
        System.out.print("A soma de " + a + " + " + b + " = ");
        int result = a + b;
        System.out.println(result);
    }

    public void somar(double a, double b){
        System.out.print("A soma de " + a + " + " + b + " = ");
        double result = a + b;
        System.out.println(result);
    }

    public void somar(int a, int b, int c){
        System.out.print("A soma de " + a + " + " + b + " + " + c + " = ");
        int result = a + b + c;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        c1.somar(10, 20);
        c1.somar(10.0, 15.0);
        c1.somar(10,20,30);
        
    }
}
