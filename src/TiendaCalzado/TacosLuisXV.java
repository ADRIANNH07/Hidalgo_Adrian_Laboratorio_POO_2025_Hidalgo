package TiendaCalzado;


public class TacosLuisXV extends Tacos {
    private boolean importado;

    public TacosLuisXV(String id, int talle, double precioBase, boolean importado) {
        super(id, talle, precioBase);
        this.importado = importado;
    }

    public double getPrecioVenta() {
        double precioTacos = super.getPrecioVenta();
        if (importado) {
            return precioTacos * 1.50;
        }
        return precioTacos;
    }
}
