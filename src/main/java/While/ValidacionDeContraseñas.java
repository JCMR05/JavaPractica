package While;

import java.util.Scanner;

public class ValidacionDeContraseñas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final String contraseña = "Sena12345";
        
        System.out.print("Introduce la contrasena de acceso: ");
        String n = consola.nextLine();
        
        
        while(!n.equals(contraseña)){
        System.out.printf("Contrasena incorrecta!%nIntentelo otra vez: %n");
        n = consola.nextLine();
        }
        
        System.out.printf("Contrasena corrrecta! %n");
        consola.close();
        
    }   
}