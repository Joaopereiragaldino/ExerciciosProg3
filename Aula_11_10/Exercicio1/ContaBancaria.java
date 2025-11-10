package Aula_11_10.Exercicio1;

public abstract class ContaBancaria {
    protected double saldo;
    private String nome;
    private int numero;

    public ContaBancaria(String anome, double asaldo, int anumero){
        this.saldo = asaldo;
        this.nome = anome;
        this.numero = anumero;
    }

    public abstract void MostraSaldo();
    public abstract boolean sacar(double valor);
    public abstract void depositar(double valor);
}
