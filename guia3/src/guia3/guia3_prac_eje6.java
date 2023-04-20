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
public class guia3_prac_eje6 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, opcion;
        String respuesta = "n";
        do {
            System.out.println("Ingrese dos numero enteros positivos");
            num1 = read.nextInt();
            num2 = read.nextInt();
            System.out.println("MENU:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion");
        
            opcion = read.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Estas seguro que quiere salir: S/N");
                    respuesta = read.next();
                    break;
                default:
                    System.out.println("Ingrese una opcion dentro del menu");
            }        
                    
        } while (respuesta.equalsIgnoreCase("s") != true);
        System.out.println("El programa a finalizado");
            
   
    }
    
}
    
    

