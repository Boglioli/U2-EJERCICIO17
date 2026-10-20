import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {
        VehiculoElectrico vehiculo = new VehiculoElectrico(50, 20);
        SurtidorElectrico surtidor = new SurtidorElectrico();
        System.out.println("vehiculo conectado al surtidor");
        System.out.println("bateria inicial: " + vehiculo.getNivelActual() + "kwh");
        System.out.println();
        surtidor.iniciarCarga(vehiculo, 10);
        System.out.println();
        System.out.println("carga terminada");
        System.out.println("bateria final: " + vehiculo.getNivelActual() + " kwh" );
    }
}





















































