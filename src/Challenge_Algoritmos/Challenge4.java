package Challenge_Algoritmos;

import java.util.Scanner;

/*
    Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
    usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
    número comprendido entre 0 y 1000. Se compara el número introducido con el
    calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
    función del caso. Se repite la operación hasta que el usuario encuentra el número.
 */
public class Challenge4 {

    public static void main(String[] args) {
        //Creacion del numero aleatorio del 0 al 1000
        int number = (int) (Math.random()*(1001));
        //Variable primitiva del numero introducida por el usuario
        int u_number;
        //Definimos un objeto Scanner el cual nos permite obtener la entrada de datos primitivos
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("-\t\tNUMERO ALEATORIO\t\t-");
        System.out.println("-------------------------------------------------");
        //Ingreso del numero a probar
        System.out.print("Ingrese un número comprendido de 0 a 1000: ");
        u_number = sc.nextInt();
        //Bucle while para la iteraccion de la igualdad de los numeros
        while (u_number != number) {            
            //Condicional que evalua si el numero introducido es menor al numero generado
            if (u_number < number) {
                //Mensaje de ayuda
                System.out.println("El número es mayor");
            } else {
                //Mensaje de ayuda
                System.out.println("El número es menor");
            }
            //Se solicita al usuario ingresar otro numero de prueba
            System.out.print("Ingrese otro número: ");
            u_number = sc.nextInt();
        }
        //Mensaje de Felicitaciones al atinar el numero
        System.out.println("¡Felicidades acertaste el numero!");
        
    }
}
