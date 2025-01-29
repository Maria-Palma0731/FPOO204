import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce la altura del triangulo: ");
        int a = scn.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * i - 1) - 2 * (j - 1) + " ");
            }
            System.out.println();
        }
    }
}
