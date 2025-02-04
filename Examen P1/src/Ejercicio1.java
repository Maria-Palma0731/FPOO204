import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Los Multiplos de 10 hasta 1000: ");
        for (int i=10; i<=1000; i+=10) {
            System.out.println((i));
        }
        scn.close();
    }
}