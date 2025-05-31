
package ejercicios;

import java.util.Scanner;

public class PromedioCalificaciones {
    
    public static void main(String[] args){
        // Debo instanciar la clase
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce un numero de estudiantes: ");
        int N = consola.nextInt();
        
        double suma = 0.0;
        for(int i = 1; i <= N; i++ ){
            
            System.out.printf("Introduce la calificacion de la estudiantes %d:%n", i);
            int S = consola.nextInt();
            suma += consola.nextDouble();
        }
        
        double promedio = suma / N;
        System.out.printf("El promedio de las calificaciones es: %d%n", promedio);
        
        consola.close();
    }
    
}
