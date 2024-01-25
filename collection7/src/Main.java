import java.util.Map;
import java.util.TreeMap;

/*Crea un mapa (TreeMap) que asocie edades con nombres y muestra los nombres en orden ascendente según la edad.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear un TreeMap de edades y nombres
        Map<Integer, String> personas = new TreeMap<>();

        // Agregar personas al TreeMap
        personas.put(25, "Juan");
        personas.put(30, "María");
        personas.put(22, "Carlos");

        // Mostrar los nombres en orden ascendente según la edad
        System.out.println("Nombres en orden ascendente según la edad: " + personas.values());
    }
}