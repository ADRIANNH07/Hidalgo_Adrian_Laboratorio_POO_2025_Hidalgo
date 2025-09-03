package Vehiculos;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 180, 4, "Nafta");
        Moto moto = new Moto("Honda", "CG Titan", 140, 150, true);
        Camion camion = new Camion("Scania", "R500", 120, 8000, 4);

        System.out.println("Autonomia del auto: " + auto.calcularAutonomia(50, 0.1) + " km");
        System.out.println("La moto puede llevar acompañante?: " + (moto.puedeLlevarAcompanante() ? "Si" : "No"));
        System.out.println("Peso total permitido del camión: " + camion.calcularPesoTotalPermitido() + " kg");

        if (moto.puedeLlevarAcompanante()) {
            System.out.println("La moto esta habilitada para llevar acompañante.");
        } else {
            System.out.println("La moto no puede llevar acompañante.");
        }

        double pesoAtransportar = 25000;
        if (pesoAtransportar <= camion.calcularPesoTotalPermitido()) {
            System.out.println("El camion puede transportar " + pesoAtransportar + " kg.");
        } else {
            System.out.println("El camion NO puede transportar " + pesoAtransportar + " kg.");
        }

        Vehiculo[] vehiculos = { auto, moto, camion };
        for (Vehiculo v : vehiculos) {
            v.mover();
        }
    }
}
