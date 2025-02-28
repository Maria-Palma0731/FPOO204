import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Menu:\n1. Registrar Vehiculo\n" +
                    "2. Registrar conductor\n" +
                    "3. Crear envio\n" +
                    "4. Registrar entrega\n" +
                    "5. Salir");
            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingresar placa del vehiculo:");
                    String modelo = JOptionPane.showInputDialog("Ingresar el modelo del vehiculo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresar capacidad de carga:"));
                    Vehiculo vehiculo = new Vehiculo(placa, modelo, capacidad);
                    JOptionPane.showMessageDialog(null, "Vehiculo registrado.....");
                    break;
                case "2":
                    String nombre = JOptionPane.showInputDialog("Ingresar nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingresar identificacion del conductor:");
                    String licencia = JOptionPane.showInputDialog("Ingresar la licencia del conductor:");
                    Conductor conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor registrado.");
                    break;
                case "3":
                    Envio envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envio creado con codigo: " + envio.getCodigoEnvio());
                    break;
                case "4":
                    String numeroGuia = JOptionPane.showInputDialog("Ingresar numero de guia:");
                    Entrega entrega = new Entrega(numeroGuia);
                    entrega.actualizarEstado();
                    JOptionPane.showMessageDialog(null, "Estado actualizado: " + entrega.getEstado());
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
                    break;
            }
        }
    }
}