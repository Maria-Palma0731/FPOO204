import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero (Positivo): ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i + 2 <=n){
              System.out.print(", ");
            }
        }
    }
}
