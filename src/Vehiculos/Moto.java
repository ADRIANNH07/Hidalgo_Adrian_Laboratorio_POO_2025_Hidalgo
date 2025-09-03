package Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;
    private boolean tieneBaul;

    public Moto(String marca, String modelo, int velocidadMaxima, int cilindrada, boolean tieneBaul) {
        super(marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTieneBaul() {
        return tieneBaul;
    }

    public void setTieneBaul(boolean tieneBaul) {
        this.tieneBaul = tieneBaul;
    }

    public boolean puedeLlevarAcompanante() {
        return cilindrada >= 125;
    }

    @Override
    public void mover() {
        System.out.println("La moto se mueve agilmente entre el trafico.");
    }
}
