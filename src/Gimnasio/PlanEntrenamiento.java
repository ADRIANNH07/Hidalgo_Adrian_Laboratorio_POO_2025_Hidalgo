package Gimnasio;

public abstract class PlanEntrenamiento {
    protected String codigo;
    protected String intensidad;
    protected double costoBase;

    public PlanEntrenamiento(String codigo, String intensidad, double costoBase) {
        this.codigo = codigo;
        this.intensidad = intensidad;
        this.costoBase = costoBase;
    }

    public abstract double calcularCostoTotal();

    public boolean estaEnPromocion() {
        return costoBase < 20000;
    }
}