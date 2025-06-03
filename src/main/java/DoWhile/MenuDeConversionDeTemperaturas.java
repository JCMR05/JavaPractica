
package DoWhile;

import java.util.Scanner;

public class MenuDeConversionDeTemperaturas {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Ingresar grados Celcius");
        System.out.println("2. Ingresar grados Fahrenheit");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = consola.nextInt();
        int P1 = 0;
        int P2 = 0;
        switch (opcion) {
           
        case 1:
        System.out.println("\n Bienvenido a Celcius ");
        System.out.println("Ponga los grados Celcius:");
        P1 = consola.nextInt();
        System.out.printf("Los grados celcius son: %d%n ", P1);
        System.out.println("Desea convertir a Farenheit?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int P3 = consola.nextInt();
        if (P3 == 1) {
            System.out.println("Los grados Farenheit son: " + (P1 * 9 / 5) + 32);
            System.out.println("¿Desea convertir a Kelvin?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int P4 = consola.nextInt();
            if (P4 == 1) {
                System.out.println("Los grados Kelvin son: " + (P1 + 273. 15));
                }
                }
                break;
        
        case 2:
        System.out.println("\n Bienvenido a Fahrenheit ");
        System.out.println("Ponga los grados Fahrenheit:");
        P1 = consola.nextInt();
        System.out.printf("Los grados Fahrenheit son: %d%n ", P1);
        System.out.println("Desea convertir a Celcius?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int P3 = consola.nextInt();
        if (P3 == 1) {
            System.out.println("Los grados Celcius son: " + ((P1 − 32) × 5/9));
            System.out.println("¿Desea convertir a Kelvin?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int P4 = consola.nextInt();
            if (P4 == 1) {
                System.out.println("Los grados Kelvin son: " + ((P1 − 32) × 5/9 + 273.15));
                }
                }
                break;
    }
    }   while (opcion != 3);
    consola.close();
    }
}
