 public class Caixa<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa) {
        this.coisaNaCaixa= coisa;
    }

    public T pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        // crianfo uma caixa para guardar strings
        Caixa<String> caixaDeTexto = new Caixa<>();

        caixaDeTexto.guardar("Oi mundo!");

        String texto = caixaDeTexto.pegar();
        
        System.out.println(texto);
    }
}

