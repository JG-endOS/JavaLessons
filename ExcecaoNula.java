public class ExcecaoNula {
    @SuppressWarnings("null")
    public static void main(String[] args) {

        String nome = null; //variaveis locais devem ser inicializadas 

        try {

            int tamanhoNome = nome.length(); //acessando objeto nulo

            System.out.println("Tamanho do nome: " + tamanhoNome);
        
        } catch (NullPointerException e) {
            
            System.out.println("Erro: A variavel 'nome' esta nula!");

        } finally {

            System.out.println("Sempre execute o bloco finally!"); //opcional
        }
    }
}
