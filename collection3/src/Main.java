import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Crea un conjunto (Set) de números enteros y realiza operaciones básicas como agregar elementos, eliminar elementos y mostrar el contenido del conjunto.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear un conjunto de números enteros
        Set<Integer> numeros = new HashSet<>();

        // Agregar elementos al conjunto
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(8);
        // Mostrar el contenido del conjunto
        System.out.println("Conjunto de números: " + numeros);

        // Eliminar un elemento del conjunto
        numeros.remove(5);

        // Mostrar el contenido actualizado del conjunto
        System.out.println("Conjunto después de eliminar el 5: " + numeros);
        }
    }
