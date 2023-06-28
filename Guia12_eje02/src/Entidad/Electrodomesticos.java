/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author dani.delgado
 */
public class Electrodomesticos {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomesticos() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        String colorLowerCase = color.toLowerCase();
        if (colorLowerCase.equals("blanco") || colorLowerCase.equals("negro")
                || colorLowerCase.equals("rojo") || colorLowerCase.equals("azul")
                || colorLowerCase.equals("gris")) {
            this.color = colorLowerCase;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomesticos() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico: ");
        String color = read.next();
        setColor(color);

        System.out.println("Ingrese el consumo energetico (letra entre A y F): ");
        String consumo = read.next();
        if (!consumo.isEmpty()) {
            char letra = consumo.toUpperCase().charAt(0);
            setConsumoEnergetico(letra);
        }

        System.out.println("Ingrese el peso del electrodomestico: ");
        double peso = read.nextDouble();
        setPeso(peso);
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        
        if (peso >= 1 && peso <= 19){
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49){
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79){
            precioFinal += 500;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}
