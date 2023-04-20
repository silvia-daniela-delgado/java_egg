package entidad;

import java.util.Scanner;

/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del
5% si tiene menos de 30 años.
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public void cargarDatos(Empleado datos) {
        boolean salir = true;

        do {
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            System.out.println("ingrese su nombre");
            datos.setNombre(read.nextLine());
            System.out.println("ingrese su edad");
            datos.setEdad(read.nextInt());
            System.out.println("ingrese su salario");
            datos.setSalario(read.nextInt());

            if (edad >= 30) {
                salario *= 1.1;
            } else {
                salario *= 1.05;
            }
            System.out.println("El sueldo del empleado" + datos.getNombre() + "es: " + datos.getSalario());
            System.out.println("desea ingresar otro empleado");
            String login = read.next();
            if (login.equalsIgnoreCase("NO")) {
                salir = false;

            }
            System.out.println("---------------------------------------------");
        } while (salir);
        
    }
}
