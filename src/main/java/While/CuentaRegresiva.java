package While;

import java.util.Scanner;

public class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero positivo n para la cuenta regresiva: ");
        
        int n = consola.nextInt();
        int i = 1;
        
        System.out.printf("Cuenta regresiva de %d:%nEn %n", n);
        while(n >= 0){
        System.out.printf("%d %n", n);
        n -= i;
        }
        
        System.out.printf("Boom!%n");
        consola.close();
        
    }   
}