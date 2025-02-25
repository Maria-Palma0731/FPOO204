import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuenta[] cuentas = {
                new Cuenta(1, "Maria Palma Torres", 50000),
                new Cuenta(2, "Ernesto Torres Palma", 33000)
        };

        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Consultar cuenta\n2. Ingresar\n3. Retirar\n4. Transferir\n5. Salir");
            if (opcion == null || opcion.equals("5")) break;

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta: "));
            Cuenta cuenta = (numero > 0 && numero <= cuentas.length) ? cuentas[numero - 1] : null;

            if (cuenta == null) {
                JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                continue;
            }

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, cuenta.getInfo());
                    break;
                case "2":
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a ingresar:"));
                    cuenta.ingresarEfectivo(ingreso);
                    JOptionPane.showMessageDialog(null, "Actualizacion de saldo: $" + cuenta.getSaldo());
                    break;
                case "3":
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a retirar:"));
                    JOptionPane.showMessageDialog(null, cuenta.retirarEfectivo(retiro) ? "Retiro exitoso." : "Saldo insuficiente.");
                    break;
                case "4":
                    int destinoNum = Integer.parseInt(JOptionPane.showInputDialog("Cuenta destino:"));
                    Cuenta destino = (destinoNum > 0 && destinoNum <= cuentas.length) ? cuentas[destinoNum - 1] : null;

                    if (destino == null || destino == cuenta) {
                        JOptionPane.showMessageDialog(null, "Cuenta destino no válida.");
                        continue;
                    }

                    float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a transferir:"));
                    JOptionPane.showMessageDialog(null, cuenta.transferir(destino, cantidad) ? "Transferencia exitosa." : "Saldo insuficiente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        }
    }
}
