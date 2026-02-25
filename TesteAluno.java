class Pessoa{

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}

class Estudante extends Pessoa{

    int matricula;

    public Estudante(String nome, int idade, int matricula) {
    super(nome, idade);
    this.matricula = matricula;
    }

    public int getMatricula() {
    return matricula;
    }
}

public class TesteAluno{
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("João", 20, 12345);

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
    }
}