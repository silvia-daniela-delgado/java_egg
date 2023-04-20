/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio03_main;

/**
 *
 * @author Usuario
 */
public class Guia7_ejercicio03_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio03_class nueva = new ejercicio03_class();
        nueva.crearOperacion();
        System.out.println("suma es: " + nueva.sumar());
        System.out.println("resta es: " + nueva.restar());
        System.out.println("multiplicacion es: " + nueva.multiplcar());
        System.out.println("division es: " + nueva.dividir());
    }
    
}
