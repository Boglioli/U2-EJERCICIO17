public class SurtidorElectrico {
    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {
        System.out.println("carga iniciada");
        for (int i = 1; i <= minutos; i++) {
            if(vehiculo.estaCargado()) {

                System.out.println("carga detenida");
                break;
            }
            System.out.println("minuto " + i);
            vehiculo.recibirCarga(5);

        if(vehiculo.estaCargado()) {
            System.out.println("la bateria llego al 100%");
            System.out.println("carga finalizada");
            break;
        }
    }
}
}