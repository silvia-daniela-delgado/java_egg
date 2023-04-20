/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3;

import java.util.Scanner;

public class extra_eje7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de numeros a solicitar:");
        int n = read.nextInt();
        int valorMaximo = 0, valorMinimo = 0, contador = 0;
        double promedio = 0;
        int num;
        while (contador < n) {
            System.out.println("ingrese un numero");
            num = read.nextInt();
            if (contador == 0) {
                valorMaximo = num;
                valorMinimo = num;
            }
            if (valorMaximo < num) {
                valorMaximo = num;
            } else if (valorMinimo > num) {
                valorMinimo = num;
            }
            promedio += num;
            contador++;
        }
        promedio /= n;
        System.out.println("el numero mas grande es:" + valorMaximo);
        System.out.println("el numero mas chico es:" + valorMinimo);
        System.out.println("el promedio de los numeros es:" + promedio);

    }

}
