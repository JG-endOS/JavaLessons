public class ExcecaoArray {
    public static void main(String[] args) {

        try {

            int[] numeros = {1, 2, 3, 4, 5, 6};

            System.out.println(numeros[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {
            
            System.out.println("Fim!");
        }
    }
}