package clase_4;

public class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        setStock(stock);
    }
    public boolean retirar(int cant){
        if (cant <= 0 || cant > stock) {
            return false;
        }
        stock -= cant;
        return true;
    }
    public boolean ingresar(int cant){
        if (cant <= 0){
            return false;
        }
        stock += cant;
        return true;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock < 0){
            throw new IllegalArgumentException("El stock no puede ser menor a cero -> " + stock);
        }
        this.stock = stock;
    }
}
