public class Carro{

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String amarca, String amodelo, int aano){
        this.marca = amarca;
        this.modelo = amodelo;
        this.ano = aano;
    }


    public void exibirinfo(){
        System.out.println("Exibindo os dados do Carro: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
    
    public static void main(String[] args) {
        Carro c;
        c = new Carro("Toyota", "SUV", 2006);
        Carro c2;
        c2 = new Carro("Fiat", "Esportivo", 2020);

        // Testando o metodo exibirdados 
        c.exibirinfo();
        c2.exibirinfo();

    }
}