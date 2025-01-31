import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = 5000;
        String m;
        boolean band = false;
        System.out.println("Saldo: $" + s);
        System.out.println("D: 100");
        System.out.println("R: 50");
        do {
            System.out.print("Ingresar Operacion (D,R): ");
            m = scn.nextLine();
            if (m.equals("d") || m.equals("D")) {
                System.out.println("Depositado $100.");
                s += 100;
            } else if (m.equals("r") || m.equals("R")) {
                System.out.println("Retirado $50.");
                s -= 50;
            } else if (m.equals("")) {
                band = true;
            }
        } while (!band);
        System.out.println("Saldo final: $" + s);
    }
}