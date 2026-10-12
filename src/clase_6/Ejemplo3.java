package clase_6;

import java.time.LocalDate;

public class Ejemplo3 {
    public record Producto(String id, String nombre, double precio, LocalDate fechaCreacion){
        public Producto {
            if (id == null || id.isBlank()){
                throw new IllegalArgumentException("EL id no puede ser nulo ni vacio");
            }
            if (precio < 0){
                throw new IllegalArgumentException("El precio n puede ser negativo");
            }
            nombre = nombre.trim();
        }
        public double precioConIgv(double tasa){
            return this.precio * (1 + tasa);
        }
    }
    public static void main(String[] args){
        Producto p1 = new Producto("1", "Bolsa", 20.00, LocalDate.now());

        // lectura sin el prefijo get
        System.out.println("Nombre normalizado: " + p1.nombre);
        System.out.println("Precio con IGV (18%): " + p1.precioConIgv(0.18));

        // Inmutabilidad
        System.out.println("Representacion: " + p1);

        // Comparacion por valor (no por referencia)
        Producto pduplicado = new Producto("1", "Bolsa", 20.00, p1.fechaCreacion);
        System.out.println("Son iguales por valor: " + p1.equals(pduplicado));
    }
}
