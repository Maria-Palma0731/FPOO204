import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("Ingrese la primera palabra: ");
         String p1 = scn.nextLine();
         System.out.println("Ingrese la segunda palabra: ");
         String p2 = scn.nextLine();
         int l1 = p1.length();
         int l2 = p2.length();

         if (l1 > l2) {
             System.out.println("Palabra larga: " + p1);
             System.out.println("Letras de mas: " + (l1 - l2));
         } else if (l2 > l1) {
             System.out.println("Palabra larga: " + p2);
             System.out.println("Letras mas: " + (l2 - l1));
         } else {
             System.out.println("Misma longitud.");
         }
         scn.close();
     }
 }