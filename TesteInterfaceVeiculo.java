interface Veiculo{
    //metodos abstratos
    void iniciar();
    void parar();

    //metodo padrao
    default void buzinar(){
        System.out.println("O veiculo buzina!");
    }
}

class Carro implements Veiculo{

    public void iniciar(){
        System.out.println("O carro inicia!");
    }

    public void parar(){
        System.out.println("O carro para!");
    }
    
}

class Caminhao implements Veiculo{

    public void iniciar(){
        System.out.println("O caminhao inicia!");
    }

    public void parar(){
        System.out.println("O caminhao para!");
    }
    
}

public class TesteInterfaceVeiculo {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.iniciar();
        carro.buzinar();
        carro.parar();

        System.out.println("\n");

        Caminhao caminhao = new Caminhao();
        caminhao.iniciar();
        caminhao.buzinar();
        caminhao.parar();
    }
}
