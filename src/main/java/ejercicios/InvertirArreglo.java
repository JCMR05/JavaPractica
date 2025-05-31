
package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class InvertirArreglo {
    
    public static void main(String[] args){
        // Debo instanciar la clase
        Scanner consola = new Scanner(System.in);
        
        System.out.print("¿Cuantas palabras vas a ingresar? ");
        int n = consola.nextInt();
        consola.nextLine();
        String[] palabras = new String[n];
        
        for(int i = 0; i <= n; i++ ){
            
            System.out.printf("Palabra %d:%n", i+1);
            palabras[i] = consola.nextLine();
        }
        
        System.out.printf("Arreglo Original: " + Arrays.toString(palabras));
        
        // Invertimos el arreglo
        for (int i = 0; i < n / 2; i++) {
        String temp = palabras[i];
        palabras[i] = palabras[n - 1 - i];
        palabras[n - 1 - i] = temp;
        }
        System.out.println("Arreglo invertido: " + Arrays.toString(palabras));
        consola.close();
    }
    
}
