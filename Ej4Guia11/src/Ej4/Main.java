package Ej4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Operaciones operacion = new Operaciones();
        int opc = 0;
        String n1, n2;

        do {
            try {

                System.out.println("----MENU----");
                System.out.println("1-Sumar");
                System.out.println("2-Restar");
                System.out.println("3-Multiplicar");
                System.out.println("4-Dividir");
                System.out.println("5-Salir");
                opc = read.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Ingrese primero numero");
                        n1 = read.next();
                        System.out.println("Ingrese segundo numero");
                        n2 = read.next();
                        operacion.cargarNumeros(Integer.parseInt(n1), Integer.parseInt(n2));
                        System.out.println("La suma es: " + operacion.suma());
                        break;
                    case 2:
                        System.out.println("Ingrese primero numero");
                        n1 = read.next();
                        System.out.println("Ingrese segundo numero");
                        n2 = read.next();
                        operacion.cargarNumeros(Integer.parseInt(n1), Integer.parseInt(n2));
                        System.out.println("La resta es: " + operacion.resta());
                        break;
                    case 3:
                        System.out.println("Ingrese primero numero");
                        n1 = read.next();
                        System.out.println("Ingrese segundo numero");
                        n2 = read.next();
                        operacion.cargarNumeros(Integer.parseInt(n1), Integer.parseInt(n2));
                        System.out.println("La multiplicacion es: " + operacion.producto());
                        break;
                    case 4:
                        System.out.println("Ingrese primero numero");
                        n1 = read.next();
                        System.out.println("Ingrese segundo numero");
                        n2 = read.next();
                        operacion.cargarNumeros(Integer.parseInt(n1), Integer.parseInt(n2));
                        System.out.println("La division es: " + operacion.cociente());
                        break;
                    case 5:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("opcion incorrecta!");
                        break;
                }
            } catch (InputMismatchException e) {
                read.next();
                System.out.println("La opcion debe ser un entero");

            } catch (NumberFormatException e) {
               // read.next();
                System.out.println("Deben ser enteros los numeros");

            } catch (ArithmeticException e) {
                //read.next();
                System.out.println("ERROR division por cero");

            } finally {
                System.out.println();
            }
        } while (opc != 5);

    }

}
