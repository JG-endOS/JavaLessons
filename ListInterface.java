import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Java");

        lista.add("Python");

        lista.add("C++");

        //elemento duplicado
        lista.add("C++");

        System.out.println("Lista: " + lista);

        System.out.println("Contem Java? " + lista.contains("Java")); //true

        //adicionando todos os elementos de outra colecao
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
        lista.addAll(outraLista);

        System.out.println("Lista completa:" + lista);

        //removendo un elemento da lista
        lista.remove("Python");

        System.out.println("Lista alterada: " + lista);

        //obtendo um elemento pelo indice
        String elemento = lista.get(2);

        System.out.println(elemento);

        //limpando a lista
        lista.clear();

        System.out.println("Lista limpa: " + lista);
    }
}