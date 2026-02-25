interface serVivo { 
    void respirar(); 
}

interface Animal extends serVivo { //por padrao ele eh PUBLIC, STATIC E FINAL
    String DESCRICAO = "Animal eh um ser vivo importante!";
    void fazerSom(); //metodo abstrato(ABSTRACT)

    default void meuMetodoDefault(){
        System.out.println("Testando o metodo default!"); //metodo default na interface
    }

    static void meuMetodoStatic(){
        System.out.println("Testando o metodo static!"); //metodo static na interface
    }
}

//classe cachorro que implementa a interface animal
class Cachorro implements Animal {
    
    public void fazerSom(){
        System.out.println("O cachorro faz: au-au!");
    } 

    public void respirar(){
        System.out.println("O cachorro respira!\n");

    } 
}

//classe gato que tambem implementa a interface animal
class Gato implements Animal {

    public void fazerSom(){
        System.out.println("O gato faz: miau!");
    }

    public void respirar(){
        System.out.println("O gato respira!");
    } 
}

public class TesteInterfaces {
    public static void main(String[] args) {

        System.out.println(Animal.DESCRICAO + "\n");
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.respirar();

        Gato gato = new Gato();
        gato.fazerSom();
        gato.respirar();
    }
}