package clase_12.Ejemplo3;

import java.util.*;

public class Tienda {
    private Map<String, Producto> catalogo = new HashMap<>();
    private Set<String> categorias = new HashSet<>();
    private List<Producto> historialVentas = new ArrayList<>();

    public void registrarProducto(Producto producto){
        if (catalogo.containsKey(producto.sku())){
            System.out.println("El sku ya existe en el catalogo");
            return;
        } else {
            catalogo.put(producto.sku(), producto);
            categorias.add(producto.categoria());
            System.out.println("Se registro el producto al catalogo");
        }
    }
    public Producto buscarPorSku(String sku){
        return catalogo.get(sku);
    }
    public void registrarVenta(String sku){
        if (catalogo.containsKey(sku)){
            Producto vendido = catalogo.get(sku);
            historialVentas.add(vendido);
            System.out.println("Venta registrada: " + vendido.nombre());
        } else {
            System.out.println("No se encontró el producto con SKU: " + sku);
        }
    }
    public void mostrarReporte(){
        System.out.println("---REPORTE---");
        System.out.println("Cantidad de productos en catalogo: " + catalogo.size());

        System.out.println("Categorias disponibles: " + categorias);

        double totalRecaudado = 0;
        for (Producto p : historialVentas){
            totalRecaudado += p.precio();
        }

        System.out.println("Total de ventas realizadas: " + historialVentas.size());
        System.out.println("Total recaudado en caja: " + totalRecaudado);
        System.out.println("---------------------------\n");
    }
}
