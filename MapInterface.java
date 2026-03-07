import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Java", 10);
        mapa.put("Python", 20);
        mapa.put("C++", 30);

        System.out.println("Mapa: " + mapa);

        System.out.println("Contem 'Java'? " + mapa.containsKey("Java"));

        mapa.remove("Java");

        System.out.println("Mapa alterado: " + mapa);

        System.out.println("Valor associado a 'C++' => " + mapa.get("C++"));

        mapa.clear();

        System.out.println("Mapa limpo: " + mapa);

    }
}