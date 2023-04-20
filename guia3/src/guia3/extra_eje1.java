/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
calcular su equivalente: 1 día, 2 horas.
*/
package guia3;

import java.util.Scanner;

public class extra_eje1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("ingrese los minutos a cenvertir:");
        int minutos = read.nextInt();
        
        int horas = minutos / 60;
        int dias = horas / 24;
        int minrestantes = minutos - horas*60;
        
        System.out.println("los" + minutos + "se convierte en:" + dias + "dias" + (horas- 24*dias) + "horas y" + minrestantes + "minutos");
        
        
        // TODO code application logic here
    }
    
}
