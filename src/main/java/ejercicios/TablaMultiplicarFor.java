package ejercicios;

import java.util.Scanner;

public class TablaMultiplicarFor {
     public static void main(String[] args){
        // Debo instanciar la clase
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero para generar su tabla de multiplicar: ");
        int num = consola.nextInt();
        int resultado = 0;
        
        System.out.printf("Tabla de multiplicar del %d:%n", num);
        
        for(int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %2d = %d%n", num, i, num * i);
        }
        consola.close();
    }
    
}
