import LevenshteinDistance.LevenshteinDistances;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        String str1 = "identificar";
        String str2 = "identifico";

        LevenshteinDistances ld = new LevenshteinDistances();
        ld.setWords(str1, str2);

        // Mostrar resultados
        System.out.println("Palabra1: " + str1);
        System.out.println("Palabra2: " + str2);
        System.out.println("\nDistancia de Levenshtein:\n" + ld.getDistancia());
        System.out.println("Afinidad:\n" + ld.getAfinidad() * 100 + " %");

        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

        System.out.println("\nDistancia de Levenshtein 2: " + levenshteinDistance.apply(str1, str2));
    }
}
