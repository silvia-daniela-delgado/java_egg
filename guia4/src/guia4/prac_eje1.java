package guia4;


import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. 
 */
public class prac_eje1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = read.nextInt();
        System.out.println("Elija alguna de las siguientes opciones: S, R, M, D");
        String option = read.next();
        switch (option.toUpperCase()) {
            case "S":
                int aux = suma(num, num2);
                System.out.println("La suma es: " + aux);
                break;
            case "R":
                aux = rest(num, num2);
                System.out.println("La resta es: " + aux);
                break;
            case "M":
                aux = multiplicar(num, num2);
                System.out.println("La multiplicacion es: " + aux);
                break;
            case "D":
                double aux2 = division(num, num2);
                System.out.println("La resta es: " + aux2);
                break;
        }
    }

    public static int suma(int num, int num2) {
        int sum = num + num2;
        return sum;
    }

    public static int rest(int num, int num2) {
        int rest = num - num2;
        return rest;
    }

    public static int multiplicar(int num, int num2) {
        int mult = num * num2;
        return mult;
    }

    public static double division(int num, int num2) {
        double div = num / num2;
        return div;
    }
}
