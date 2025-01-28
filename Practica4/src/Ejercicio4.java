import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresar una palabra: ");
        String c = scn.nextLine();

        c = c.replaceAll("\\s+", "").toLowerCase();
        int l = c.length();
        boolean ep = true;
        for (int i = 0; i < l / 2; i++) {
            if (c.charAt(i) != c.charAt(l - i - 1)) {
                ep = false;
                break;
            }
        }
        if (ep) {
            System.out.println("Es palindromo.");
        } else {
            System.out.println("No es palindromo.");
        }
    }
}
