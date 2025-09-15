package Gimnasio;

import java.util.ArrayList;
import java.util.List;

public class GimnasioCode {
    private String nombre;
    private double costoMantenimiento;
    private List<PlanEntrenamiento> planes;

    public GimnasioCode(String nombre, double costoMantenimiento) {
        this.nombre = nombre;
        this.costoMantenimiento = costoMantenimiento;
        this.planes = new ArrayList<>();
    }

    
    public void agregarPlan(PlanEntrenamiento plan) {
        planes.add(plan);
    }

    
    public double calcularCapitalNeto() {
        double totalPlanes = 0;
        for (PlanEntrenamiento plan : planes) {
            totalPlanes += plan.calcularCostoTotal();
        }
        return totalPlanes - costoMantenimiento;
    }

    public boolean esElite() {
        for (PlanEntrenamiento plan : planes) {
            if (plan.estaEnPromocion()) {
                return false;
            }
        }
        return true;
    }

    
    public void mostrarResumen() {
        System.out.println("Gimnasio: " + nombre);
        System.out.println("Capital Neto: $" + calcularCapitalNeto());
        System.out.println("Es gimnasio de elite?: " + (esElite() ? "Si" : "No"));
    }
}