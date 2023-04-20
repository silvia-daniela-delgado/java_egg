/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia3_prac_eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String vfrase;
        
        System.out.print("ingrese una frase o palabra");
        vfrase = read.next();
        
        if (vfrase.substring(0).equals("A")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
