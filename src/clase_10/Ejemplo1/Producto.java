package clase_10;

public class Producto implements Descontable{

    private double precio;

    public Producto(double precio){
        this.precio = precio;
    }

    @Override
    public double calcularDescuento(){
        return precio * 0.10;
    }
}
