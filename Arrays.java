package projetos_básicos;

public class Arrays {
    public static void main(String[] args) {

        int[] meuArray; // declaracao do array
        
        meuArray = new int[3]; // criacao do array
        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;

        meuArray = new int[]{5, 8, 2}; // cria e preenche o array

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        // alterando os indices do array
        meuArray[0] = 10;

        System.out.println("Valor alterado para: " + meuArray[0]);

        // percorrendo arrays
        for (int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);
        }
    }
}
