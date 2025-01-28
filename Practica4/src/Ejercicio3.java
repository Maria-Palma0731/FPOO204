import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresar la edad: ");
        int e=scn.nextInt();
        double p;
        if (e < 4) {
            p=0;
        } else if (e <= 18) {
            p=110;
        } else {
            p=190;
        }
        System.out.println("Precio de entrada: " + p);
    }
}
