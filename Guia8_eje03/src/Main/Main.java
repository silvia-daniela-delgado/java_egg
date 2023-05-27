package Main;

import Entidad.Persona;
import Servicio.Servicio;

public class Main {

    public static void main(String[] args) {
        Servicio ps = new Servicio();
        Persona[] personas = new Persona[4];
        boolean[] edad = new boolean[4];
        int[] imcs = new int[4];
        for (int i = 0; i < 4; i++) {
            personas[i] = ps.CrearPersona();
            imcs[i] = ps.CalcularIMC(personas[i]);
            ps.esMayorDeEdad(personas[i]);
            switch (ps.CalcularIMC(personas[i])) {
                case 1:
                    System.out.println("1");
                    break;
                case -1:
                    System.out.println("-1");
                    break;
                case 0:
                    System.out.println("0");
                    break;
                default: 
                    System.out.println("Porcentaje personas mayores de edad: " + ps.porcentajeMayorEdad(personas[i]));
                    System.out.println("Porcentaje personas menores de edad: " + ps.porcentajeMenorEdad(personas[i]));
                    System.out.println("Porcentaje personas con bajo peso: " + ps.porcentajeBajoPeso(personas[i]));
                    System.out.println("Porcentaje personas con peso normal: " + ps.porcentajePesoNormal(personas[i]));
                    System.out.println("Porcentaje personas con sobrepeso: " + ps.porcentajeSobrepeso(personas[i]));
            }
        }
    }
}
