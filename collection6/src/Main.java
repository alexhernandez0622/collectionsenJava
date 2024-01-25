import java.util.LinkedList;
import java.util.List;

/*Crea una lista (LinkedList) de nombres y realiza operaciones para agregar nombres al principio y al final de la lista.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear una LinkedList de nombres
        List<String> nombres = new LinkedList<>();

        // Agregar nombres al final de la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Mostrar la lista de nombres
        System.out.println("Lista de nombres: " + nombres);

        // Agregar un nombre al principio de la lista
        ((LinkedList<String>) nombres).addFirst("Ana");

        // Mostrar la lista actualizada
        System.out.println("Lista después de agregar 'Ana' al principio: " + nombres);
    }
}