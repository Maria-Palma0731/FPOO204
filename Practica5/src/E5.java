import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String f = scn.nextLine();
        System.out.print("Introduce una letra: ");
        char l = scn.next().charAt(0);
        int c = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == l) {
                c++;
            }
        }
        System.out.println("La letra '" + l + "' aparece " + c + " veces en la frase.");
    }
}
