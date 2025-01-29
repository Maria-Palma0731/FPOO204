import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scn.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
