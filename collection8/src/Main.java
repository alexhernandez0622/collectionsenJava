import java.util.*;

/*Crea un mapa que asocie meses con números y
muestra los meses en el orden en el que fueron insertados.*/
public class Main {
    public static void main(String[] args)
    {
        // Crear una Map para los meses con su indicativo
        Map<String, Integer> meses = new HashMap<>();

        // Agregar meses al HashMap
        meses.put("Enero", 1);
        meses.put("Febrero", 2);
        meses.put("Marzo", 3);
        meses.put("Abril", 4);

        //Mostrar los meses en el orden de inserción
        System.out.println("Meses en el orden de inserción es: " + meses.keySet());
    }
}