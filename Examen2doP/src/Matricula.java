import java.util.Random;
import javax.swing.JOptionPane;
public class Matricula{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anioNacimiento;
    private String carrera;
    private String matricula;

    public Matricula(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anioNacimiento = anioNacimiento;
        this.carrera = carrera;
        this.matricula = generarMatricula();
    }

    private String generarMatricula() {
        int anioActual = java.time.Year.now().getValue();
        String anioActualStr = String.valueOf(anioActual).substring(2);
        String anioNacimientoStr = String.valueOf(anioNacimiento).substring(2);

        char inicialNombre = nombre.charAt(0);
        char inicialApellidoPaterno = apellidoPaterno.charAt(0);
        char inicialApellidoMaterno = apellidoMaterno.charAt(0);

        Random random = new Random();
        int numAleatorio = random.nextInt(900) + 100;
        String carreraStr = carrera.substring(0, 3).toUpperCase();
        return anioActualStr + anioNacimientoStr + inicialNombre + inicialApellidoPaterno + inicialApellidoMaterno + numAleatorio + carreraStr;
    }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" +
                "Apellido Paterno: " + apellidoPaterno + "\n" +
                "Apellido Materno: " + apellidoMaterno + "\n" +
                "Anio de Nacimiento: " + anioNacimiento + "\n" +
                "Carrera: " + carrera + "\n" +
                "Matrícula: " + matricula);
    }
}