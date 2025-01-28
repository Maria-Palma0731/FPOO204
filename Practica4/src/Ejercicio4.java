import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresar una palabra: ");
        String c = scn.nextLine();
        String ci = new StringBuilder(c).reverse().toString();

        if (c.equalsIgnoreCase(ci)) {
            System.out.println("La palabra es un palindromo.");
        } else {
            System.out.println("La palabra no es un palindromo.");
        }
        scn.close();
    }
}