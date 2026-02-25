package projetos_básicos;
public class DiasNoMes {
    public static void main (String[] args) {

        String mes = "nov.";

        String dias = switch (mes) {

            case "jan.", "mar.", "mai.", "jul.", "ago.", "out.", "dez" -> "31 Dias!";

            case "abr.", "jun.", "set.", "nov." -> "30 Dias!";

            case "fev." -> "28 Dias!";

            default -> "Mês desconhecido.";

        };

        System.out.println(dias);

    }
}
