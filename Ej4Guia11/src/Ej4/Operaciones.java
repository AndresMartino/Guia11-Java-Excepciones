/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author andrelo
 */
public class Operaciones {

    private int num1;
    private int num2;

    public Operaciones() {
    }

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void cargarNumeros(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int producto() {
        return num1 * num2;
    }

    public int cociente() {
        return num1 / num2;
    }
}
