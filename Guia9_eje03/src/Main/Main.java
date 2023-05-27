import servicio.ArregloServicio;

/*En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class Main {

    public static void main(String[] args) {
        ArregloServicio arrS = new ArregloServicio();
        double[] A = new double[50];
        double[] B = new double[20];

        arrS.inicializarA(A);
        arrS.mostrarArreglo(A);
        arrS.ordenar(A);
        arrS.mostrarArregloMayorAMenor(A);
        arrS.inicializarB(A, B);
        arrS.mostrarArreglo(A);
        arrS.mostrarArreglo(B);
        
    }
}

