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

        // ejercicio 2
        System.out.println("Ingresar nombre: ");
        String n = scn.nextLine();
        System.out.println("Ingresar apellido paterno: ");
        String ap = scn.nextLine();
        System.out.println("Ingresar apellido materno: ");
        String am = scn.nextLine ();
        String nc = n.toUpperCase().charAt(0) + " " + ap.toUpperCase().charAt(0)+ " " + am.toUpperCase().charAt(0);

        System.out.println(nc.toLowerCase());
        System.out.println(nc.toUpperCase());
        System.out.println(nc);

//        //Ejercicio 3
//
//  System.out.print("Ingresar un numero entero: ");
//        int X = scn.nextInt();
//        int suma = 0;
//        for (int i = 1; i <= X; i++) {
//            suma += i;
//        }
//        System.out.println("La suma: " + X + " es: " + suma);
////
////
//        //Ejercicio 4
//      int longitud;
//
//        System.out.print("Ingrese su nombre: ");
//        String nombre = scn.nextLine();
//
//        longitud = nombre.length();
//
//        System.out.print(nombre.toUpperCase() + " tiene " + longitud + " letras");
//
//
//        // Ejercicio 5
//        int cp, cm;
//        int pe;
//
//        System.out.print("Ingresar cantidad de payasos: ");
//        cp = scn.nextInt();
//        System.out.print("Ingrese cantidad de munecas: ");
//        cm = scn.nextInt();
//
//        pe = (cm * 75) + (cp * 112);
//        System.out.print("Peso a enviar: " + p);
//
//        //Ejercicio 6
//
//        System.out.print("Ingresar frase :");
//        String c = scn.nextLine();
//
//        String i = "";
//        for (int indice = c.length() - 1; indice >= 0; indice--) {
//            i += c.charAt(indice);
//        }
//        System.out.println("Frase: " + c);
//        System.out.println("Frase invertida: " + i);
//
//    }}}