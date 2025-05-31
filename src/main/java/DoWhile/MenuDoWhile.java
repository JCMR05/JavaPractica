package DoWhile;
import java.util.Scanner;
public class MenuDoWhile {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar la fecha actual");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = consola.nextInt();
        switch (opcion) {
        case 1:
        System.out.println("¡Hola, estudiante!");
        break;
        case 2:
        System.out.println("Fecha actual: " + java.time.LocalDate.now());
        break;
        case 3:
        System.out.println("Saliendo del programa...");
        break;
        default:
        System.out.println("Opción no válida. Intenta de nuevo.");
    }
    }   while (opcion != 3);
    consola.close();
    }
}
