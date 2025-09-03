package Vehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int cantidadEjes;

    public Camion(String marca, String modelo, int velocidadMaxima, double capacidadCarga, int cantidadEjes) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public double calcularPesoTotalPermitido() {
        return capacidadCarga * cantidadEjes;
    }

    @Override
    public void mover() {
        System.out.println("El camion avanza con potencia por la autopista (casi atropella a alguien).");
    }
}
