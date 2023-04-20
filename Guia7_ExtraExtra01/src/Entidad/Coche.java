/*
  Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package Entidad;

import java.util.Scanner;


public class Coche {
    private String marca;
    private String modelo;
    private float precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

    
    
    public void cargarDatos(Coche datos){
        Scanner read=new Scanner(System.in);
        System.out.println("Ingre la Marca");
        datos.setMarca(read.nextLine());
        System.out.println("Ingre el Modelo");
        datos.setModelo(read.nextLine());
        System.out.println("Ingre el Valor");
        datos.setPrecio(read.nextFloat());
    }
}