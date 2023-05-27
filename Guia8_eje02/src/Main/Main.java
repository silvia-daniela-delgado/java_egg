package Main;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CafeteraServicio serv = new CafeteraServicio();
        Cafetera c1 = serv.crearCafetera();
        int opcion;
        do {
            System.out.println("1-llenar cafetera \n"+
                    "2-servir taza \n"+
                    "3-vaciar cafetera \n"+
                    "4-agregar cafe \n" + "5- mostrar estado \n" + "ingrese 6 para salir \n");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    serv.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("ingrese la capacidad de la taza");
                    int taza = read.nextInt();
                    serv.servirTaza(c1,taza);
                    break;
                case 3:
                    serv.vaciarCafetera(c1);
                    break;
                case 4:
                    System.out.println("ingrese la cantidad");
                    int cantidad = read.nextInt();
                    serv.agregarCafe(c1,cantidad);
                    break;
                case 5:
                    serv.mostrarEstado(c1);
                    break;
                default: System.out.println("La opcion ingresada es incorrecta");    
            } 
        } while (opcion != 6);

    }
}