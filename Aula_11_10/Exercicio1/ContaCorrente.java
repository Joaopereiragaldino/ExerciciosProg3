package Aula_11_10.Exercicio1;

public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(String anome, double asaldo, int anumero){
        super(anome,asaldo, anumero);
    }

    @Override
    public boolean sacar(double valor){
        if(valor < 0 || valor > this.saldo){
            return false;
        } else {
            this.saldo -= valor;
            this.saldo -= 1;
            return true;
        }
    }

    @Override
    public void depositar(double valor){
        if(valor < 0){
            System.out.println(" [ERRO] Não foi possível realizar o depósito.");
        } else {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito feito com sucesso. R$ " + this.saldo);
        }
    }

    @Override
    public void MostraSaldo(){
        System.out.println("O saldo atual da sua conta: R$ " + this.saldo);
    }
}   
