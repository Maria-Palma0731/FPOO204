import javax.swing.plaf.PanelUI;

public class Spartan {
    // Atributos del Spartan
    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;

    // Metodos del Spartan
    public void mostrarInfo(){
        System.out.println("-----Informacion del Spartan-----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("ArmaPrincipal: " + armaPrincipal);
        System.out.println("--------------------------");
    }

    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a "+ enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante=10;
        int total=municiones+restante;
        System.out.println("El arma " + armaPrincipal+ " tiene " + total + " balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El spartan " + nombre + " esta corriendo");
        }else {
            System.out.println("El spartan " + nombre + " se detuvo");
        }
    }
}
