package Challenge_POO;

import java.util.Scanner;

/*
    Crear un proyecto de consola que solicite al usuario una contraseña por teclado y muestre un
    mensaje indicando la contraseña y si es o no fuerte.
 */
public class Challenge6 {

    public static void main(String[] args) {
        //Dado el Enunciado a la clase Password se le agregara el constructor con parametro de contraseña
        
        //Creacion de variable pass el cual almacenara el valor ingresado
        String pass;
        //Definimos un objeto Scanner el cual nos permite obtener la entrada de datos primitivos
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----------------------------------------");
        System.out.println("-\t\tPÁSSWORD\t\t-");
        System.out.println("-----------------------------------------");
        
        System.out.print("Ingrese una Contraseña: ");
        pass = sc.next();
        
        //Creacion del objeto Password
        Password password = new Password(pass);
        
        System.out.println("\nPASSWORD: " + password.getContraseña());
        System.out.println("Es fuerte: " + password.esFuerte());
        
    }
}
