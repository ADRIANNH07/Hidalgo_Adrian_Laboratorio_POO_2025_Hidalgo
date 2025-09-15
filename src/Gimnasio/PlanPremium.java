package Gimnasio;

public class PlanPremium extends PlanEntrenamiento {

    public PlanPremium(String codigo, String intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    public double calcularCostoTotal() {
        return costoBase * 1.40;
    }

    public boolean estaEnPromocion() {
        return costoBase < 20000 || intensidad.equalsIgnoreCase("alta");
    }
}