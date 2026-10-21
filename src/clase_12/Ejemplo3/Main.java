package clase_12.Ejemplo3;

public class Main {
    public static void main(String[] args){
        Tienda tienda = new Tienda();

        Producto p1 = new Producto("sku1", "producto 1", 200.10, "categoria 1");
        Producto p2 = new Producto("sku2", "producto 2", 300.20, "categoria 2");
        Producto p3 = new Producto("sku3", "producto 3", 400.30, "categoria 1");

        tienda.registrarProducto(p1);
        tienda.registrarProducto(p2);
        tienda.registrarProducto(p3);

        tienda.registrarProducto(new Producto("sku1", "producto 1", 200.10, "categoria 1"));

        tienda.registrarVenta("sku1");
        tienda.registrarVenta("sku3");
        tienda.registrarVenta("sku9");

        tienda.mostrarReporte();

    }
}
