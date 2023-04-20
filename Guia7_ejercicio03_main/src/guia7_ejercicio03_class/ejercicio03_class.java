/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package guia7_ejercicio03_main;

import java.util.Scanner;

public class ejercicio03_class {

    private double numero1;
    private double numero2;

    public ejercicio03_class() {
    }

    public ejercicio03_class(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1() {
        this.numero1 = numero2;
    }

    public void setNumero2() {
        this.numero1 = numero2;
    }

    public void crearOperacion() {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese dos numeros ");
        numero1 = read.nextDouble();
        numero2 = read.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplcar() {
        if (numero1 != 0 && numero2 != 0) {
            return numero1 * numero2;
        }
        System.out.println("ERROR");
        return 0;
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        }
        System.out.println("ERROR");
        return 0;
    
    }
}    
