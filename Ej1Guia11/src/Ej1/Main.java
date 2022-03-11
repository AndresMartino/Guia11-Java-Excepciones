/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Andrelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona=null;
        try{
            System.out.println( persona.mayorDeEdad());
        }catch(NullPointerException e){
            System.err.println("Error Objeto vacio");
        }
                             
    }
    
}
/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.*/