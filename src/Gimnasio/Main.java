package Gimnasio;


public class Main {
    public static void main(String[] args) {
        GimnasioCode gimnasio = new GimnasioCode("Titan Gym", 100000);

        // Agregar planes
        gimnasio.agregarPlan(new PlanBasico("B001", "media", 18000));                       // Promocion por < 20000
        gimnasio.agregarPlan(new PlanPremium("P001", "alta", 25000));                      // Promocion por la intensidad alta
        gimnasio.agregarPlan(new PlanPersonalizado("PP001", "media", 30000, true));        // No en promocion

        // Mostrar resultados 
        gimnasio.mostrarResumen();
    }
}