package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        // Crear cuentas
        CuentaBancaria cuenta1 = new CuentaAhorro("12345", "Juan Pérez", 1000);
        CuentaBancaria cuenta2 = new CuentaCorriente("67890", "Ana Gómez", 500, 200);

        // Añadir cuentas a la lista
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);

        // Operaciones
        cuenta1.depositar(200);
        cuenta2.retirar(600); 

        // Aplicar interés a las cuentas de ahorro
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorro) {
                ((CuentaAhorro) cuenta).aplicarInteres();
            }
        }

        // Mostrar información de todas las cuentas
        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarInformacion();
            System.out.println("-------------------");
        }
    }
}