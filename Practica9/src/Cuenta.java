import javax.swing.*;
public class Cuenta {
    int nCuenta;
    String titular;
    float saldo;

    public Cuenta(int nCuenta, String titular, float saldo) {
        this.nCuenta = nCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void iEfectivo(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "No puedes ingresar una cantidad negativa.");
        }
    }

    public boolean rEfectivo(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        JOptionPane.showMessageDialog(null, "Monto invalido o saldo insuficiente.");
        return false;
    }

    public boolean trans(Cuenta destino, float cantidad) {
        if (cantidad > 0 && rEfectivo(cantidad)) {
            destino.iEfectivo(cantidad);
            return true;
        }
        JOptionPane.showMessageDialog(null, "Transferencia no valida.");
        return false;
    }

    public String getInfo() {
        return "Cuenta: " + nCuenta + "\nTitular: " + titular + "\nSaldo: $" + saldo;
    }
}