import java.util.*;

/*Crea una lista (List) de cadenas de texto que representen nombres de colores. Realiza operaciones como agregar nuevos colores, eliminar colores y mostrar la lista.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear una lista de nombres de colores
        List<String> colores = new ArrayList<>();

        // Agregar colores a la lista
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        // Mostrar la lista de colores
        System.out.println("Lista de colores: " + colores);

        // Eliminar el color "Verde" de la lista
        colores.remove("Verde");

        // Mostrar la lista actualizada
        System.out.println("Lista después de eliminar 'Verde': " + colores);
      }
    }
