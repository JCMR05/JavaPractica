package While;

import java.util.Scanner;

public class ContarHastaQueIngreseCero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero positivo(ingresa cero para terminar): ");
        
        int n = consola.nextInt();
        int contador = 0;
        
        while(n != 0){
            ++contador;
            System.out.print("Introduce otro numero entero positivo(ingresa cero para terminar): ");
            n = consola.nextInt();
        }
        
        System.out.printf("Se han contado %d numeros.%n", contador);
        consola.close();
        
    }   
}