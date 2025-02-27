package Ejercicio3;

public class CuentaAhorro extends CuentaBancaria {
    private static final double INTERES = 0.02; // Interés fijo para todas las cuentas de ahorro

    public CuentaAhorro(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public void aplicarInteres() {
        saldo += saldo * INTERES;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Interés: " + (INTERES * 100) + "%");
    }
}