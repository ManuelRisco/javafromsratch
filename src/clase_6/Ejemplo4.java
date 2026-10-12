package clase_6;

import java.time.LocalDate;

public class Ejemplo4 {
    public record Perro(String nombre, String raza, LocalDate fechaNacimiento, double precio) {
        public Perro {
            if (nombre == null ||nombre.isBlank()) {
                throw new IllegalArgumentException("El nombre no puede estar en blanco ni vacio");
            }
            if (raza == null || raza.isBlank()) {
                throw new IllegalArgumentException("La raza no puede estar en blanco ni vacia");
            }
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser menor a cero");
            }
            nombre = nombre.trim().toUpperCase();
            raza = raza.trim().toUpperCase();
        }
        public double precioConIgv(double tasa){
            return this.precio * (1 + tasa);
        }
    }
    public static void main(String[] args){
        System.out.println("---INICIO DEL PROGRAMA CON RECORD---");
        Perro p1 = new Perro("Machin", "Pug", LocalDate.now(), 200.00);
        System.out.println("Nombre: " + p1.nombre());
        System.out.println("Raza: " + p1.raza());
        System.out.println("Fecha Nacimiento: " + p1.fechaNacimiento());
        System.out.println("Precio: " + p1.precioConIgv(0.18));
        System.out.println("Representacion: " + p1);
    }
}
