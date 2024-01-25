import java.util.Set;
import java.util.TreeSet;

/*Crea un conjunto (TreeSet) de palabras y
 muestra las palabras en orden alfabético.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear un TreeSet de palabras
        Set<String> palabras = new TreeSet<>();

        // Agregar palabras al TreeSet
        palabras.add("Manzana");
        palabras.add("Banana");
        palabras.add("Cereza");

        // Mostrar las palabras en orden alfabético
        System.out.println("Palabras en orden alfabético: " + palabras);
        }
    }
