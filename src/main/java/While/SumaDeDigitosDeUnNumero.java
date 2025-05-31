package While;

import java.util.Scanner;

public class SumaDeDigitosDeUnNumero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero positivo: ");
        
        int n = consola.nextInt();
        int suma = 0;
        
        while(n != 0){
            int digito = n % 10;
            suma += digito;
            n /= 10;
        }
        
        System.out.printf("La suma de sus dígitos es: %d%n", suma);
        consola.close();
        
    }   
}
