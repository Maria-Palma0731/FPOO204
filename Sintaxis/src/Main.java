
//IMPORTACIONES
import java.util.Random;
import java.util.Scanner;


//Clase Principal
public class Main {
    public static void main(String[] args) {

        // Metodo main
        /* Soy
        un comentario
        de
        varias lineas */
//        System.out.println("Hola, Maria Palma!");
//        String cadenas = "maria" + "palma" + "torres";
//
//        System.out.println(cadenas);
//
//        System.out.println(cadenas.length());
//
//        System.out.println(cadenas.substring(2,5));
//        System.out.println(cadenas.substring(2));
//        System.out.println(cadenas.substring(0,5));

//        //3. Variables
//
//        int x=5, x2;
//        double y=1.25, y2;
//        String z="204", z1;
//
//        //Conversionn de cadena a int
//        x2= Integer.parseInt(z);
//
//        //Conversionn de double a
//        z1= String.valueOf(y);
//
//        //Conversion de int a double
//        double asd= Double.valueOf(x);
//
//        //Conversion Implicita
//        int num=12;
//        double numD= num;
//        System.out.println("Conversion Implicita"+numD);
//
//        System.out.println(x2);
//        System.out.println(z1);
//        System.out.println(asd);
//
//        //Crear un objeto rdn de clase random
//        Random rdn=new Random();
//
//        //Generamos numeros y los guardamos
//        int numAleatorio=rdn.nextInt();
//        double numdoble= rdn.nextDouble();
//        System.out.println("Aleatorio entero: "+numAleatorio);
//        System.out.println("Aleatorio double: "+numdoble);

        //4. Solicitud de Datos

//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Introduce cualquier dato: ");
//        String dato= scn.nextLine();
//
//        System.out.println("Introduce dato entero: ");
//        int datoentero= scn.nextInt();
//
//        System.out.println("Introduce dato con decimales: ");
//        double datodecimal= scn.nextDouble();
//
//        System.out.println("Cualquier dato: "+ dato);
//        System.out.println("Dato entero: "+ datoentero);
//        System.out.println("Cualquier dato: "+ datodecimal);

       // 5. Boolean, operadores logicos y de comparacion

        System.out.println(10 > 9);// true
        System.out.println(10 == 9);// false
        System.out.println(10 < 9);// false
        System.out.println(10 <= 9);// false
        System.out.println(10 >= 9);//  true
        System.out.println(10 != 9);// true

        int x=3;
        System.out.println(x<5 && x>10);// false
        System.out.println(x<5 || x>10);// true
        System.out.println(!(x<5 && x>10));// true

        }
    }
