package TiendaCalzado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Sucursal> sucursales = new ArrayList<>();

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public double capitalTotal() {
        double total = 0.0;
        for (Sucursal s : sucursales) {
            total += s.capitalSucursal();
        }
        return total;
    }

    public List<Calzado> calzadosEnLiquidacion() {
        List<Calzado> lista = new ArrayList<>();
        for (Sucursal s : sucursales) {
            for (Calzado c : s.getCalzados()) {
                if (c.getPrecioBase() < 15000) {
                    lista.add(c);
                } else if (c instanceof Borcego && c.getTalle() >= 40) {
                    lista.add(c);
                }
            }
        }
        return lista;
    }

    public int localesRefinados() {
        int cont = 0;
        for (Sucursal s : sucursales) {
            if (!s.tieneCalzadoBarato()) cont++;
        }
        return cont;
    }

    public List<Sucursal> getSucursales() { return sucursales; }
}