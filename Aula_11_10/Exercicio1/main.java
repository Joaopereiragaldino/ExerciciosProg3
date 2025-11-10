package Aula_11_10.Exercicio1;

public class main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Kleber",200, 10);
        ContaPoupança c2 = new ContaPoupança("Junior",300, 15);

        c1.depositar(250);
        if(c1.sacar(1000)){
            System.out.println("O saque foi realizado com sucesso");
        } else {
            System.out.println("Não foi possível realizar o saque");
        }

        c2.depositar(700);
        if(c2.sacar(1000)){
            System.out.println("O saque foi realizado com sucesso");
        } else {
            System.out.println("Não foi possível realizar o saque");
        }

        c1.MostraSaldo();
        c2.MostraSaldo();
    }
}
