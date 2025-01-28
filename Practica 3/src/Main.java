import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        //Ejercicio 1
//        System.out.println("Horas trabajadas: ");
//        Double hr = scn.nextDouble();
//        System.out.println("Costo por horas trabajadas: ");
//        Double ph = scn.nextDouble();
//        Double p = (hr*ph);
//        System.out.printf("Pago correspondiente: "+ p);

        // Ejercicio 2
//        System.out.println("Ingresar nombre: ");
//        String n = scn.nextLine();
//        System.out.println("Ingresar apellido paterno: ");
//        String ap = scn.nextLine();
//        System.out.println("Ingresar apellido materno: ");
//        String am = scn.nextLine();
//
//        String nomc = n + " " + ap + " " + am;
//        String nc = n.toUpperCase().charAt(0) + " " + ap.toUpperCase().charAt(0)+ " " + am.toUpperCase().charAt(0);
//        System.out.println(nomc.toLowerCase());
//        System.out.println(nomc.toUpperCase());
//        System.out.println(nc);

        //Ejercicio 3
//        System.out.print("Ingresar un número entero: ");
//        int X = scn.nextInt();
//
//        int s = 0;
//        for (int i = 1; i <= X; i++) {
//            s += i;
//            if (i > 1) {
//                System.out.print(" + " + i);
//            } else {
//                System.out.print(i);
//            }
//        }
//        System.out.println(" = " + s);

        //Ejercicio 4
//        int l;
//        System.out.print("Ingresar nombre: ");
//        String n = scn.nextLine();
//        l = n.length();
//        System.out.print(n.toUpperCase() + " tiene " + l+ " letras");

//        // Ejercicio 5
//        int cp, cm;
//        int pe;
//        System.out.print("Ingresar cantidad de payasos: ");
//        cp = scn.nextInt();
//        System.out.print("Ingrese cantidad de munecas: ");
//        cm = scn.nextInt();
//        pe = (cm * 75) + (cp * 112);
//        System.out.print("Peso a enviar: " + pe);

       //Ejercicio 6
        System.out.print("Ingresar frase :");
        String cadena = scn.nextLine();

        String invertida = " ";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            invertida += cadena.charAt(indice);
        }
        System.out.println("Frase: " + cadena);
        System.out.println("Frase invertida: " + invertida);

    }
                }