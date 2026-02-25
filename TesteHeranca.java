package projetos_básicos;
class Animal {
    public String nome;
    public void fazerSom() {
        System.out.println("O animal faz som!");
    }
}

class Cachorro extends Animal {

    @Override

    public void fazerSom() {
        super.fazerSom();
        System.out.println("O cachorro late!");
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        
        dog.nome = "Rex";
        System.out.println("O nome do animal eh: " + dog.nome);
        
        dog.fazerSom();
    }
    
}