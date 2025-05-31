
package ciclosnoche;

import java.util.Scanner;

public class SumaNaturalesFor {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero positivo N: ");
        int N = consola.nextInt();
        int suma = 0;
        
        for(int i = 0; i <= N ; i++) {
            suma += i;
        }
        System.out.printf("La suma de los primeros %d numero naturales es: %d%n", N, suma);
        consola.close();
    }
    
}
