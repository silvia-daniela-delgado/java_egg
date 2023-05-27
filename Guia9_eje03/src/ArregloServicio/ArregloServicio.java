/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package servicio;

import java.util.Arrays;

/*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
public class ArregloServicio {

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.round(Math.random() * 10);
        }
        System.out.println("-----------------------------------");
    }

    public void mostrarArreglo(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
        System.out.println("-----------------------------------");
    }
    
    public void mostrarArregloMayorAMenor(double[] arreglo) {
        Arrays.sort(arreglo);
        mostrarArreglo(arreglo);
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo, 0, arreglo.length);
        
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, arregloB.length / 2);
        Arrays.fill(arregloB, arregloB.length / 2, arregloB.length, 0.5);
    }
}
