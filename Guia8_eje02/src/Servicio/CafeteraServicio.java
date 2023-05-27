/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;
public class CafeteraServicio {
    Scanner read = new Scanner(System.in);
    //creo el objeto cafetera
    public Cafetera crearCafetera(){
        Cafetera c1 = new Cafetera();
        System.out.println("ingrese la capacidad maxima de la cafetera");
        c1.setCapacidadMaxima(read.nextInt());
        c1.setCantidadActual(0);
        return c1;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(Cafetera cafetera){
        //if (cafetera.getCantidadActual()> c1.setCapacidadMaxima())
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());  
    }
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método 
    //recibe el tamaño de la taza y simula la acción de servir la taza con la 
    //capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
    //la taza, se sirve lo que quede. El método le informará al usuario si se
    //llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    public void servirTaza(Cafetera cafetera, int taza){
        if (cafetera.getCantidadActual() >= taza){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("la taza esta llena.");
        }else{
            System.out.println("la taza no se lleno. Quedo con %d ml de cafe.\n" + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);   
        }
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera, int cantidadCafe){
        int nuevaCantidad = (int) (cafetera.getCantidadActual() + cantidadCafe);
        if (nuevaCantidad > cafetera.getCapacidadMaxima()){
            System.out.println("sobrepaso la capacidad");
            System.out.println("solo se agrego: " + (cafetera.getCapacidadMaxima() - cafetera.getCantidadActual()));
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima()); 
        }else{
            cafetera.setCantidadActual(nuevaCantidad);
        }
        
        
    }
    public void mostrarEstado(Cafetera cafetera){
        System.out.println("la cantidad acual de cafe es: " + cafetera.getCantidadActual());
    }
}
