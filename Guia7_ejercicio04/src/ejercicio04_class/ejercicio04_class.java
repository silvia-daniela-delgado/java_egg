/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se
deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio04_class;

import java.util.Scanner;

public class ejercicio04_class {

    private double base;
    private double altura;

    public ejercicio04_class() {
    }

    public ejercicio04_class(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void rectangulo() {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese la base");
        base = read.nextDouble();
        System.out.println("ingrese la altura");
        altura = read.nextDouble();
    }

    public double superficie() {
        return base * altura;
    }

    public double perimetro() {
        return (base * 2) + (altura * 2);
    }

    public void asterisco() {
        for (int i = 0; i < (int) base; i++) {
            System.out.print("\n");
            for (int j = 0; j < (int) altura; j++) {
                System.out.print(" * ");

            }
        }

    }
}
