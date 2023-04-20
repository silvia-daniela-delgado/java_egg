package main;

import entidad.Cuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(10000, "daniela");

        cuenta.retirar_dinero();
        
    }
}
