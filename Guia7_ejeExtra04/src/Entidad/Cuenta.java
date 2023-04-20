/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro. 
 */
package entidad;

import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        boolean respuesta = true;
        boolean continuar = true;
        while (continuar) {
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            double dineroRetirar = read.nextInt();
            if (dineroRetirar > this.saldo) {
                System.out.println("saldo insuficiente su saldo es de: " + this.saldo);
            }
            if (dineroRetirar <= this.saldo) {
                this.saldo -= dineroRetirar;
                System.out.println("Se retiró " + dineroRetirar);
                System.out.println("Su saldo actual es de " + this.saldo);
            }
            System.out.println("desea realizar otra operacion?");
            String resp = read.next();
            if (resp.equalsIgnoreCase("NO")) {
                respuesta = false;
                continuar = false;
                System.out.println("transaccion finalizada");
            }
        }
    }
}
