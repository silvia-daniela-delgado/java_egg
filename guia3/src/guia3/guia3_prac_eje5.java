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
public class guia3_prac_eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int vnumlin, vnum,vsuma;
        System.out.println("ingrese el limite positivo");
        vnumlin = read.nextInt();
        vsuma = 0;
        while (vsuma < vnumlin){
            System.out.println("ingrese a continuacion numeros");
            vnum = read.nextInt();
            vsuma = vsuma + vnum;
        }
        System.out.println("se a superado el limite positivo");
        
    }
    
}
