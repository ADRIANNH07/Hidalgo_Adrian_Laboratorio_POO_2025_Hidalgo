package Gimnasio;

public class PlanBasico extends PlanEntrenamiento {

    public PlanBasico(String codigo, String intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    public double calcularCostoTotal() {
        return costoBase;
    }
}