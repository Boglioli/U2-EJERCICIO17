public class VehiculoElectrico {
    private double capacidadBateria;
    private double nivelActual;

    public VehiculoElectrico(double capacidadBateria, double nivelActual) {
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }
        public void recibirCarga(double kw) {
            nivelActual = nivelActual + kw;
            if(nivelActual > capacidadBateria) {
                nivelActual = capacidadBateria;
            }
            System.out.println("vehiculo recibe " + kw + "kw");
            System.out.println("nivel actual: " + nivelActual + "kw");
        }
        public boolean estaCargado() {
          return nivelActual >= capacidadBateria;
         }
         public double getNivelActual() {
        return nivelActual;
         }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }
}

