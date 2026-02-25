package projetos_básicos;
public class notafinal {
    public static void main (String[] args) {

        float nota1 = 9.0f;

        float nota2 = 3.5f;
        
        float resultado = nota1 + nota2;

        if (resultado/2 >= 6) {
            System.out.println("Você passou com: " + resultado/2 + "!");
        }else {
            System.out.println("Você não passou: " + resultado/2 + "!");
        }

    }

}
