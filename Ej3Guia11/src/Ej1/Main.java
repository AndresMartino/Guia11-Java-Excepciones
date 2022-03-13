package Ej1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        DivisionNumero division1 = new DivisionNumero();
        System.out.println("Ingrese primer numero");
        String num1 = read.next();
        System.out.println("Ingrese segundo numero");
        String num2 = read.next();
        try {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);

            System.out.println("La division de "+n1+"/"+n2+" es :"+division1.division(n1, n2));

        } catch (NumberFormatException e) {
            System.err.println("ERROR! Incompatibilidad de tipos");
        } catch (ArithmeticException e) {
            System.err.println("ERROR! Division por cero!");
        }

    }

}
/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.*/
