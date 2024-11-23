/* EJERCICIO 1
 * 
 * Generar un programa donde se permita al usuario ingresar por consola
 * números con decimales simples o de una sola presición y realizar
 * las siguientes operaciones:
 * 
 * 1- Realizar la multiplicación, división, suma y resta.
 * 2- Mostrar los resultados con doble presición(20 decimales) y sin decimales
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        float num1, num2;
        double result;

        // recordar que el ingreso por consola de flotantes se utiliza ","
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextFloat();

        System.out.println("\t ***** RESULTADO SUMA *****");
        result = num1 + num2;
        System.out.println(String.format("La suma con doble decimales: %.20f ", result));
        System.out.println("La suma sin decimales: " + ((int)result));

        System.out.println("\t ***** RESULTADO RESTA *****");
        result = num1 - num2;
        System.out.println(String.format("La resta con doble decimales: %.20f ", result));
        System.out.println("La resta sin decimales: " + ((int)result));

        System.out.println("\t ***** RESULTADO MULTIPLICACION *****");
        result = num1 * num2;
        System.out.println(String.format("La multiplicacion con doble decimales: %.20f ", result));
        System.out.println("La multiplicacion sin decimales: " + ((int)result));

        System.out.println("\t ***** RESULTADO DIVISION *****");
        result = num1 / num2;
        System.out.println(String.format("La division con doble decimales: %.20f ", result));
        System.out.println("La division sin decimales: " + ((int)result));

    }
}
