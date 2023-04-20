package Entidad;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor para el radio");
        radio = leer.nextDouble();

    }

    public double calcularArea() {
        //Area=ã€–Ï€*radioã€—^2

        return Math.PI * Math.pow(radio, 2);

    }

    public double calcularPerimetro() {
        //(Perimetro=2*Ï€*radio).
        return 2 * Math.PI * radio;

    }

}