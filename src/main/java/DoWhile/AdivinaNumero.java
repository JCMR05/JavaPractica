package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    int objetivo = rnd.nextInt(100) + 1;
    int intento;
    int opcion;
    do {
        System.out.println("\n--- JUEGO ADIVINA NÚMERO ---");
        System.out.println("1. Intentar adivinar");
        System.out.println("2. Salir");
        System.out.print("Selecciona: ");
        opcion = sc.nextInt();
    if (opcion == 1) {
        System.out.print("Tu intento (1–100): ");
        intento = sc.nextInt();
        if (intento < objetivo) {
            System.out.println("Demasiado bajo.");
            } else if (intento > objetivo) {
                System.out.println("Demasiado alto.");
                } else {
                    System.out.println("¡Correcto! ¡Has adivinado!");
                    break;
                    }
        } else if (opcion != 2) {
        System.out.println("Opción inválida.");
        }
    } while (opcion != 2);
    System.out.println("Gracias por jugar. El número era: " + objetivo);
    sc.close();
    }
}