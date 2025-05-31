package DoWhile;
import java.util.Scanner;
public class MenuDeOperacionesAritmeticas {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = consola.nextInt();
        int P1 = 0;
        int P2 = 0;
        switch (opcion) {
           
        case 1:
        System.out.println("\n Bienvenido a suma! ");
        System.out.println("Ponga el primer numero a sumar:");
        P1 = consola.nextInt();
        System.out.println("Ponga el segundo numero a sumar:");
        P2 = consola.nextInt();
        int suma = P1 + P2;
        System.out.printf("La suma del numero %d y %d es igual a: %d%n", P1, P2, suma);
        break;
        
        case 2:
        System.out.println("\n Bienvenido a resta! ");
        System.out.println("Ponga el primer numero a restar:");
        P1 = consola.nextInt();
        System.out.println("Ponga el segundo numero a restar:");
        P2 = consola.nextInt();
        int resta = P1 - P2;
        System.out.printf("La resta del numero %d y %d es igual a: %d%n", P1, P2, resta);
        break;
        
        case 3:
        System.out.println("\n Bienvenido a multiplicar! ");
        System.out.println("Ponga el primer numero a multiplicar:");
        P1 = consola.nextInt();
        System.out.println("Ponga el segundo numero a multiplicar:");
        P2 = consola.nextInt();
        int multiplicacion = P1 * P2;
        System.out.printf("La multiplicacion del numero %d y %d es igual a: %d%n", P1, P2, multiplicacion);
        break;
        
        case 4:
        System.out.println("\n Bienvenido a dividir! ");
        System.out.println("Ponga el primer numero a dividir:");
        P1 = consola.nextInt();
        System.out.println("Ponga el segundo numero a dividir:");
        P2 = consola.nextInt();
        int division = P1 / P2;
        System.out.printf("La division del numero %d y %d es igual a: %d%n", P1, P2, division);
        break;
        
        case 5:
        System.out.println("Saliendo del programa...");
        break;
        default:
        System.out.println("Opción no válida. Intenta de nuevo.");
    }
    }   while (opcion != 5);
    consola.close();
    }
}