import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(001, "Maria Palma Torres", 50000);
        Cuenta cuenta2 = new Cuenta(002, "Ernesto Torres Palma", 33000);

        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Consultar cuenta\n2. Ingresar\n3. Retirar\n4. Transferir\n5. Salir");
            if (opcion == null || opcion.equals("5")) break;

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta: "));
            Cuenta cuenta = (numero == 001) ? cuenta1 : (numero == 002) ? cuenta2 : null;
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
                    cuenta.iEfectivo(ingreso);
                    JOptionPane.showMessageDialog(null, "Actualizacion de saldo: $" + cuenta.saldo);
                    break;
                case "3":
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a retirar:"));
                    JOptionPane.showMessageDialog(null, cuenta.rEfectivo(retiro) ? "Retiro exitoso." : "Saldo insuficiente.");
                    break;
                case "4":
                    int destinoNum = Integer.parseInt(JOptionPane.showInputDialog("Cuenta destino:"));
                    Cuenta destino = (destinoNum == 001) ? cuenta1 : (destinoNum == 002) ? cuenta2 : null;
                    if (destino == null || destino == cuenta) {
                        JOptionPane.showMessageDialog(null, "Cuenta destino no valida.");
                        continue;
                    }
                    float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a transferir:"));
                    JOptionPane.showMessageDialog(null, cuenta.trans(destino, cantidad) ? "Transferencia exitosa." : "Saldo insuficiente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        }
    }
}
