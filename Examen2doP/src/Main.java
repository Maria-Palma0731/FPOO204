//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresar nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("Ingresar apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingresar apellido materno:");
        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingresar anio de nacimiento:"));
        String carrera = JOptionPane.showInputDialog("Ingresar carrera:");

        Matricula alumno = new Matricula(nombre, apellidoPaterno, apellidoMaterno, anioNacimiento, carrera);
        alumno.mostrarDatos();
        }
    }
