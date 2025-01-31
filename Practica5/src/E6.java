import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = 0;
        String o;

        while (true) {
            System.out.print("Escriba la bitacora de operaciones: ");
            o = scn.nextLine();
            if (o.isEmpty()) {
                break;
            }
            String[] p = o.split(" ");
            char t = p[0].charAt(0);
            int c = Integer.parseInt(p[1]);
            if (t == 'D') {
                s+= c;
            } else if (t == 'R') {
                s-= c;
            }
        }
        System.out.println("Saldo final: " + s);
    }
}
