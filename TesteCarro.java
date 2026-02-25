package projetos_básicos;
class Veiculo{
    public void Acelerar(){
        System.out.println("Veiculo acelerando!");
    }
}

class Carro extends Veiculo{

    @Override

    public void Acelerar(){
        super.Acelerar();
        System.out.println("Carro acelerando!");

    }
}

public class TesteCarro{
    public static void main(String[] args){
        Carro car = new Carro();

        car.Acelerar();
     }
}   

