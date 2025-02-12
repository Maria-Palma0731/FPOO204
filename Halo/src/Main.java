//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Creamos Objeto = Instanciar objeto.
        Spartan jefeMaestro = new Spartan();
        jefeMaestro.nombre = "John 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto";

        // Usar metodos de jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        // Segundo Objeto Reach.
        Spartan reach = new Spartan();
        reach.nombre = "Miguel";
        reach.salud = 200;
        reach.escudo = 500;
        reach.armaPrincipal = "Aquijoneador";
        
        // Metodos del segundo Objeto.
        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(0);
        reach.correr(false);
    }
}