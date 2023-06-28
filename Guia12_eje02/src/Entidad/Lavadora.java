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
public class Lavadora extends Electrodomesticos {
    private double carga;
    
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        crearElectrodomesticos();
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la carga de la lavadora: ");
        
        double carga = read.nextDouble();
        setCarga(carga);
    }
    
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30){
            precioFinal += 500;
        }
        return precioFinal;
    }
}
