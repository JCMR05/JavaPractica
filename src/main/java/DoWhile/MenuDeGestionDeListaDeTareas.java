
package DoWhile;

import java.util.Scanner;
import java.util.ArrayList;

public class MenuDeGestionDeListaDeTareas {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    ArrayList<String> tareas = new ArrayList<>();
    int opcion;
    String tarea;
    do {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Mostrar todas las tareas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = consola.nextInt();
        switch (opcion) {
           
        case 1:
        System.out.println("\n Escribe la tarea ");
        tarea = consola.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea agregada.");
        break;
        
        case 2:
        System.out.println("\n Tus tareas:")
        for (int i = 0; i < tareas.size (); i++) {
            System.out.printf("%d. %s%n", i + 1, tareas.get(i));
        }
        break;
        default:
        System.out.println("Opción desconocida.");
    }   
    } while (opcion != 3);
    
    consola.close();
    
    }
}