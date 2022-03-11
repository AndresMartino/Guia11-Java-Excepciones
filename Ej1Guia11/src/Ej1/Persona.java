/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(int num) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String sex;
        System.out.printf("\nIngrese nombre de la persona %d\n", num);
        this.nombre = read.next();
        System.out.printf("Ingrese edad de la persona %d\n", num);
        this.edad = read.nextInt();
        System.out.printf("Ingrese sexo de la persona %d\n", num);
        sex = read.next().toUpperCase();
        while (!(sex.equals("M") || sex.equals("F") || sex.equals("O"))) {
            System.out.println("ERROR! sexo mal ingresado, vuelva a hacerlo M,F,O");
            sex = read.next().toUpperCase();
        }
        this.sexo = sex;
        System.out.printf("Ingrese peso de la persona %d\n", num);
        this.peso = read.nextDouble();
        System.out.printf("Ingrese altura de la persona %d\n", num);
        this.altura = read.nextDouble();
    }

    public int calcularImc() {
        if (this.peso / Math.pow(this.altura, 2) < 20) {
            return -1;
        } else if (this.peso / Math.pow(this.altura, 2) >= 20 && this.peso / Math.pow(this.altura, 2) <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean mayorDeEdad() {
        return this.edad >= 18;
    }
}
