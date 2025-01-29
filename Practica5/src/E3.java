import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresar numero para realizar tabla: ");
        int n = scn.nextInt();
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j<=10; i++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
