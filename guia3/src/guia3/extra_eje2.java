/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle 
un valor diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3;

import java.util.Scanner;

public class extra_eje2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c, d, aux;

        System.out.print("Ingrese A:");
        a = read.nextInt();
        System.out.print("Ingrese B:");
        b = read.nextInt();
        System.out.print("Ingrese C:");
        c = read.nextInt();
        System.out.print("Ingrese D:");
        d = read.nextInt();

        System.out.println("Variables iniciales: A)" + a + " B)" + b + " C)" + c + " D)" + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Variables Cambiadas: A)" + a + " B)" + b + " C)" + c + " D)" + d);
    }
}
