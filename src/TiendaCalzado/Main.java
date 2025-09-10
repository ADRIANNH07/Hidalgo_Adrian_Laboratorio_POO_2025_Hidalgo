package TiendaCalzado;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Sucursal s1 = new Sucursal("Centro", 20000);
        s1.agregarCalzado(new Sandalia("S1", 38, 12000));
        s1.agregarCalzado(new Borcego("B1", 41, 18000));

        Sucursal s2 = new Sucursal("Norte", 15000);
        s2.agregarCalzado(new Tacos("T1", 37, 17000));
        s2.agregarCalzado(new TacosLuisXV("L1", 38, 20000, true));

        empresa.agregarSucursal(s1);
        empresa.agregarSucursal(s2);

        System.out.println("Capital total: " + empresa.capitalTotal());
        System.out.println("Calzados en liquidación: " + empresa.calzadosEnLiquidacion().size());
        System.out.println("Locales refinados: " + empresa.localesRefinados());
    }
}

