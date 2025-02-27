package Ejercicio3;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    public CuentaCorriente(String numero, String titular, double saldo, double limiteDescubierto) {
        super(numero, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && (saldo - cantidad) >= -limiteDescubierto) {
            saldo -= cantidad;
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Límite de descubierto: " + limiteDescubierto);
    }
}