package Challenge_Algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
    caso se terminará el programa.
    Al terminar, mostrará lo siguiente:
    a. – mayor número introducido
    b. – menor número introducido
    c. – suma de todos los números
    d. – suma de los números
 */
public class Challenge5 {

    public static void main(String[] args) {
        //Creacion de ArrayList para almacenar los numeros ingresados
        ArrayList<Integer> numeros = new ArrayList<>();
        //Creacion de variable primitiva para el ingreso de numeros
        int number = 0;
        //Definimos un objeto Scanner el cual nos permite obtener la entrada de datos primitivos
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("-\t\tLISTA DE NUMEROS\t\t-");
        System.out.println("-------------------------------------------------");
        //Se imprime instrucciones
        System.out.println("\nIngrese números repetidamente, parara cuando ingrese el valor de -1.");
        //Se emplea un bucle while para interar el ingreso de numeros
        while (number != -1) {
            //Ingreso de datos por el usuario
            System.out.print("Ingrese un número: ");
            number = sc.nextInt();
            //Condicional el cual valida si el numero introducido es diferente de -1
            //Si es asi se agrega a la lista
            if (number != -1) {
                numeros.add(number);
            }

        }
        
        //Se utiliza el ordenamiento de Collection (Ordenando los numeros de manera ascendente)
        Collections.sort(numeros);
        //Condicional el cual identifica si la lista se lleno de almenos un valor
        if (numeros.size() > 0) {
            //Se imprime los resultados
            System.out.println("\nNúmero mayor: " + numeros.get(numeros.size() - 1));
            System.out.println("Número menor: " + numeros.get(0));
            //Se utiliza un metodo el cual nos retorna la suma de todos los numeros ingresados
            System.out.println("Suma de Números: " + sumaLista(numeros));
            //El enunciado no especifica bien asi que puse la cantidad
            System.out.println("Cantidad de Números: " + numeros.size());
        } else {
            System.out.println("No se ingreso ningun valor a la lista.");
        }

    }

    //Metodo el cual retorna la suma de los valores de la lista
    public static int sumaLista(ArrayList<Integer> num) {
        int suma = 0;

        for (Integer integer : num) {
            suma += integer;
        }

        return suma;
    }

}
