/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Vector {

    private int[] V=new int[5];
    private int n;

    public Vector() {
    }

    public Vector(int[] V, int n) {
        this.V = V;
        this.n = n;
    }

    public int[] getV() {
        return V;
    }

    public void setV(int[] V) {
        this.V = V;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void crearVector() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        //System.out.println("Ingrese tamaño del vector");
        //this.n = read.nextInt();
        //V = new int[n];
        for (int i = 0; i < V.length; i++) {
            V[i]=i;
        }
    }

   
    public int mostrar(int num){
    
        return V[num];
    }
    
}
