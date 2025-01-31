import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int n = scn.nextInt();
        if(n<=0){
            System.out.println("Error: Ingresa otro numero 0");
        } else {
            for(int i=1; i<=n; i++) {
                if (i % 2 !=0){
                    System.out.print(i);
                    if(i<n - 1){
                        System.out.print(", ");
                    }
                }
            }
        }
       scn.close();
            }
        }

