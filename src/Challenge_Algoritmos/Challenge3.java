package Challenge_Algoritmos;

import java.util.Scanner;

/*
    Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
    nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
    pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
    multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
    tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
    multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.
 */
public class Challenge3 {

    public static void main(String[] args) {
        //Se establecen las variables primitivas
        double v_hora;
        String nombre;
        int anios;
        int horas_m;
        double total;
        double bonificacion;
        double importe;
        //Definimos un objeto Scanner el cual nos permite obtener la entrada de datos primitivos
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("-\t\tDATOS EMPLEADO\t\t-");
        System.out.println("-----------------------------------------");
        //Ingreso de datos por el usuario
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.next();
        System.out.print("Ingrese el valor hora del empleado: $");
        v_hora = sc.nextDouble();
        System.out.print("Ingrese la antiguedad del empleado (años): ");
        anios = sc.nextInt();
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado en el mes: ");
        horas_m = sc.nextInt();
        //Calculo del total
        total = v_hora * horas_m;
        //Calculo de la bonificacion mediante un operador ternario
        bonificacion = (anios > 10) ? 30 * anios : 0;
        //Calculo del importe final
        importe = total + bonificacion;
        //Impresion de resultados a la pantalla
        System.out.println("\nEmpleado: " + nombre);
        System.out.println("Antiguedad: " + anios + " años");
        System.out.println("Total: $" + total);
        System.out.println("Bonificacion: $" + bonificacion);
        System.out.println("Importe a cobrar: $" + importe);

    }
}
