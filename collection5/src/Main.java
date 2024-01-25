import java.util.LinkedHashSet;
import java.util.Set;

/*Crea un conjunto (LinkedHashSet) de números enteros y muestra los números en el orden en el que fueron insertados.*/
public class Main {
    public static void main(String[] args) {
        // Crear un LinkedHashSet de números enteros
        Set<Integer> numeros = new LinkedHashSet<>();

        // Agregar números al LinkedHashSet
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);

        // Mostrar los números en el orden de inserción
        System.out.println("Números en el orden de inserción: " + numeros);
    }
}