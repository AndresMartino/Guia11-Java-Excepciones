/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Vector vector = new Vector();
        vector.crearVector();
        try {
            System.out.println("Ingrese posicion a ver dentro del vector");
            System.out.println(vector.mostrar(read.nextInt()));
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.err.println("Error! Fuera de rango");
        } catch (InputMismatchException t){
            System.err.println("Posicion ingresada como caracter");
        
        }finally{
            System.out.println("ola mundo");
        }

    }

}
/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).*/
