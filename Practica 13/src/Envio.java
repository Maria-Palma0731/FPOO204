import javax.swing.JOptionPane;
public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0;
    }
    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
    public String getCodigoEnvio() { return codigoEnvio; }
    public String getDestino() { return destino; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingresar codigo del envio:");
        String destino = JOptionPane.showInputDialog("Ingresar destino del envio:");
        String pesoStr = JOptionPane.showInputDialog("Ingresar peso del envio:");
        return (pesoStr.isEmpty()) ? new Envio(codigo, destino) : new Envio(codigo, destino, Double.parseDouble(pesoStr));
    }
}//
