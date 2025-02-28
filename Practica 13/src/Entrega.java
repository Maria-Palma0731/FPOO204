import javax.swing.JOptionPane;
public class Entrega {
    private String numeroGuia;
    private String estado;
    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }
    public String getNumeroGuia() { return numeroGuia; }
    public String getEstado() { return estado; }
    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingresar nuevo estado de entrega:");
        if (nuevoEstado.equals("En transito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Verifica informacion de estado.");
        }
    }
}
///