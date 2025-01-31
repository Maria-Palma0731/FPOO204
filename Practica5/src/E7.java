import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.print("Base del arbol: ");
        int b = scn.nextInt();
        int f = 1, e = b - 1;
        while (f <= (b * 2 - 1)) {
            int tempE = e, tempF = f;
            while (tempE-- > 0) System.out.print(" ");
            while (tempF-- > 0) System.out.print("*");
            System.out.println();
            f += 2;
            e--;
        }
        scn.close();
    }
}
