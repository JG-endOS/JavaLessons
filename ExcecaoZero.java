public class ExcecaoZero {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //ArithmeticException

        int totalNotas = 10;
        int quantidadeAlunos = 10;

        try {
            int media = totalNotas / quantidadeAlunos; //Divisisao por zero
        
        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisao por 0!");

        } finally {
            System.out.println("O programa terminou!");
        }
    }
}
