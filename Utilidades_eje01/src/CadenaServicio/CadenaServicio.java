/*Crear una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos:
*/
package servicios;

import entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    private Scanner scanner = new Scanner(System.in);
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
    //tiene la frase ingresada.
    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char c = cadena.getFrase().charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        sb.reverse();
        System.out.println("La frase invertida es: " + sb.toString());
    }
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el
    //usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
    }
    //Método compararLongitud(String frase), deberá comparar la longitud de la 
    //frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena, String otraFrase) {
        int longitudOtraFrase = otraFrase.length();
        if (cadena.getLongitud() > longitudOtraFrase) {
            System.out.println("La frase original es más larga.");
        } else if (cadena.getLongitud() < longitudOtraFrase) {
            System.out.println("La nueva frase es más larga.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
    //Método unirFrases(String frase), deberá unir la frase contenida en la 
    //clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cadena, String otraFrase) {
        String resultado = cadena.getFrase() + " " + otraFrase;
        System.out.println("La frase resultante es: " + resultado);
    }
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
    //que se encuentren en la frase, por algún otro carácter seleccionado por 
    //el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena cadena, String letra, String reemplazo) {
        String resultado = cadena.getFrase().replace(letra, reemplazo);
        System.out.println("La frase resultante es: " + resultado);
    }
    //Método contiene(String letra), deberá comprobar si la frase contiene una 
    //letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }
}
