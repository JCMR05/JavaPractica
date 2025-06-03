package DoWhile;

import java.util.Scanner;
import java.util.ArrayList;

public class MenuDeCalculosEstadisticos {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    ArrayList<double> valor = new ArrayList<>();
    int opcion;
    double valor;
    
    // Primera fase: llenado de datos
    System.out.println("Introduce números (0 para terminar):");
    while ((valor = sc.nextDouble()) != 0) {
    datos.add(valor);
    }

    int opcion;
    do {
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("1. Suma");
        System.out.println("2. Promedio");
        System.out.println("3. Máximo");
        System.out.println("4. Salir");
        System.out.print("Elige opción: ");
        opcion = sc.nextInt();
    switch (opcion) {
        case 1:
        double suma = 0;
        for (double d : datos) suma += d;
        System.out.printf("Suma: %.2f%n", suma);
        break;
        case 2:
        double suma2 = 0;
        for (double d : datos) suma2 += d;
        System.out.printf("Promedio: %.2f%n", suma2 / datos.size());
        break;
        case 3:
        double max = datos.get(0);
        for (double d : datos) if (d > max) max = d;
        System.out.printf("Máximo: %.2f%n", max);
        break;
        case 4:
        System.out.println("Saliendo del menú de estadísticas...");
        break;
        default:
        System.out.println("Opción no válida.");
    }
    } while (opcion != 4);
    sc.close();
}
}