public class FinalVariables {

    final int numeroMaximo = 100;
    final String mensagem = "Bem-vindo ao mundo da programação!";

    public void ImprimirValoresFinais(int numeroMaximo, String mensagem){
        
        System.out.println("O valor final eh: " +  numeroMaximo);
        System.out.println("A mensagem final eh: " +  mensagem);
    }
    
    public static void main(String[] args) {

        FinalVariables obj = new FinalVariables();
        obj.ImprimirValoresFinais(obj.numeroMaximo, obj.mensagem);
     }
}
