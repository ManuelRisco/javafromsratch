package clase_6;

public class Producto {
    public record Perro(String nombre, double precio){}

    public static void main(String[] args){
        Perro p1 = new Perro("producto 1", 10);
        System.out.println(p1.nombre());
        System.out.println(p1.precio());
        System.out.println(p1.toString());
    }
}
