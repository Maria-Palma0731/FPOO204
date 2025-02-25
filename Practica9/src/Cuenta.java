import javax.swing.*;

public class Cuenta {
    private int nCuenta;
    private String titular;
    private float saldo;

    // Constructor
    public Cuenta(int nCuenta, String titular, float saldo) {
        this.nCuenta = nCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos Getter y Setter
    public int getNCuenta() {
        return nCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    // Métodos de operación
    public void ingresarEfectivo(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "No puedes ingresar una cantidad negativa.");
        }
    }

    public boolean retirarEfectivo(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        JOptionPane.showMessageDialog(null, "Monto invalido o saldo insuficiente.");
        return false;
    }

    public boolean transferir(Cuenta destino, float cantidad) {
        if (cantidad > 0 && retirarEfectivo(cantidad)) {
            destino.ingresarEfectivo(cantidad);
            return true;
        }
        JOptionPane.showMessageDialog(null, "Transferencia no valida.");
        return false;
    }

    public String getInfo() {
        return "Cuenta: " + nCuenta + "\nTitular: " + titular + "\nSaldo: $" + saldo;
    }
}