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
public class Televisor extends Electrodomesticos {
    private int resolucion;
    private boolean sintonizadorTDT;
    
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor() {
        crearElectrodomesticos();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la resolucion del televisor (en pulgadas): ");
        int resolucion = read.nextInt();
        setResolucion(resolucion);
        
        System.out.println("¿Tiene sintonizador TDT incorporado? (true/false)");
        boolean sintonizadorTDT = read.nextBoolean();
        setSintonizadorTDT(sintonizadorTDT);
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40){
            precioFinal *= 1.3;
        }
        if (sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}