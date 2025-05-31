
package ejercicios;

import java.util.Scanner;

public class BuscarunUnArregloConFor {
    public static void main(String[] args){
        // Debo instanciar la clase
        Scanner consola = new Scanner(System.in);
        
        int[] datos = {5, 8, 2, 9, 3, 7, 1};
        
        System.out.print("Introduce un numero entero a buscar dentro del arreglo y determinar su posicion en el indice: ");
        int clave = consola.nextInt();
        
        boolean encontrado = false;
        
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < datos.length; i++ ){
            if(datos[i] == clave) {
                System.out.printf("El numero %d encontrado en la posicion %d.%n", clave, i);
                encontrado = true;
                break;
            }
        }
        long fin = System.currentTimeMillis();
        
        if(!encontrado) {
            System.out.printf("Numero %d No se encontro en el arreglo.%n", clave);
        }
        
        float tiempo = inicio - fin;
        
        System.out.println("Tiempo de ejecucion: " + tiempo);
        
        consola.close();
    }
    
}
