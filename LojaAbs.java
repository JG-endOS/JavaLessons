abstract class Loja {
    long cnpj;
    String razaoSocial;
    boolean aberta;

    void abrir() {
        System.out.println("A loja esta aberta!");
        aberta = true;
    }
    
    void fechar() {
        System.out.println("A loja esta fechada!");
        aberta = false;
    }

}

class LojaComercial extends Loja {

    LojaComercial(long cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

     void resultados() {
        System.out.println("O CNPJ da loja eh: " + this.cnpj);
        System.out.println("A razao social da loja eh: " + this.razaoSocial);
    }

}

public class LojaAbs {
    public static void main(String[] args) {
        LojaComercial loja = new LojaComercial(12345678909L, "Fazer dinheiro!");

        loja.resultados();
        loja.fechar();
    }
}