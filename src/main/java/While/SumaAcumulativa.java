package While;

import java.util.Scanner;

public class SumaAcumulativa {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero positivo n: ");
        
        int n = consola.nextInt();
        int suma = 0;
        int i = 1;
        
        while(i <= n){
        suma += i;
        i++;
        }
        
        System.out.printf("El suma de 1 a %d es: %d%n", n, suma);
        consola.close();
        
    }   
}