package Aula_11_03.Questao6;

public class ContaBancaria {
    private int numero;

    public ContaBancaria(int anumero){
        this.numero = anumero;
    }

    public int getNumero(){
        return numero;
    }

    @Override
    public String toString() {
        return ("Numero da Conta = " + this.numero);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        else if(o.getClass() != this.getClass()){
            return false;
        } 
        else if(((ContaBancaria)o).getNumero() != this.getNumero()){
            return false;
        } 
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1);
        ContaBancaria c2 = new ContaBancaria(2);

        boolean teste = c1.equals(c2);

        System.out.println(teste);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
