import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String password = "MariaPalma";
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresar  contrasena: ");
        String contrasena = scn.nextLine();

        if (contrasena.equalsIgnoreCase(password)) {
            System.out.println("Contrasena es correcta.");
        } else {
            System.out.println("Contrasena es incorrecta.");
        }
    }
}

