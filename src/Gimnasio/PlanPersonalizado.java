package Gimnasio;

public class PlanPersonalizado extends PlanEntrenamiento {
    private boolean incluyeNutricion;

    public PlanPersonalizado(String codigo, String intensidad, double costoBase, boolean incluyeNutricion) {
        super(codigo, intensidad, costoBase);
        this.incluyeNutricion = incluyeNutricion;
    }


    public double calcularCostoTotal() {
        double costo = costoBase * 1.60;
        if (incluyeNutricion) {
            costo *= 1.20;
        }
        return costo;
    }
}