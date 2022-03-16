package Challenge_Algoritmos;

import java.util.Scanner;

/*
    Pide un número por teclado e indica si es un número primo o no. Un número primo es
    aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
    25 es divisible entre 5, sin embargo, 17 si es primo.
 */
public class Challenge1 {

    public static void main(String[] args) {
        //Declaracion de la variable "num" (El cual sera el número ingresado por el usuario)
        int num;
        //Definimos un objeto Scanner el cual nos permite obtener la entrada de datos primitivos
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("-\tDETECTOR DE NUMEROS PRIMO\t-");
        System.out.println("-----------------------------------------");

        //Establecemos un ciclo do-while para evaluar las condiciones del ingreso del dato
        do {
            //Establecemos un capturador de excepciones debido a que el usuario
            //puede ingresar datos que no corresponden a un numero entero
            try {
                System.out.print("Ingrese el numero a analizar: ");
                //inicializamos la variable "num" con el valor entero ingresado por el usuario
                num = sc.nextInt();
                if (num > 1) {
                    break;
                } else {
                    System.out.println("Casi. Por favor ingrese un numero entero mayor a 1.\n");
                    continue;
                }
            } catch (Exception e) {
                //Imprimimos el mensaje de error
                System.out.println("Ops. Algo ocurrio, procure ingresar un numero entero mayor a 1.\n");
                //limpiamos el Scanner
                sc.next();
                continue;
            }
        } while (true);

        //Establecemos una condicional en la cual se evaluara
        //El resultado de la funcion numberEvaluate
        if (numberEvaluate(num)) {
            //Si el resultado es true, imprime que el numero es primo
            System.out.println("\nResultado: NÚMERO PRIMO");
        } else {
            //Si el resultado es true, imprime que el numero es compuesto
            System.out.println("\nResultado: NÚMERO COMPUESTO");
        }

    }

    //Funcion que envia un balor booleano indicando si es o no
    //un número primo, el dato ingresado como parametro
    public static boolean numberEvaluate(int n) {
        boolean evaluacion = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                evaluacion = false;
            }
        }

        return evaluacion;
    }

}
