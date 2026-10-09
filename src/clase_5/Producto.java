package clase_5;

import java.util.Scanner;

public class Producto {
    private final String codigo;
    private int stock;

    public Producto(String codigo, int stock) {
        if (codigo == null || codigo.isBlank() || stock <= 0) {
            throw new IllegalArgumentException("Datos invalidos");
        }
        this.codigo = codigo;
        this.stock = stock;
    }

    public void retirar(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            throw new IllegalArgumentException("Retiro invalido");
        }
        stock -= cantidad;
    }

    public void ingresar(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Ingreso invalido");
        }
        stock += cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public static void pedirDatos(Scanner scanner) {

        System.out.print("Cuantos productos va a agregar? ");
        int cuantos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cuantos; i++){
            System.out.println("Producto " + i);

            // Producto stock dinamico
            String almacen_stock = String.valueOf("stockProducto"+i);
            System.out.print("Ingresa la cantidad de stock del Producto " + i + ":");
            almacen_stock = scanner.nextLine();
            int stock = Integer.parseInt(almacen_stock.trim());

            /*
            // Producto dinamico
            String almacen_producto = String.valueOf("p"+i);
            Producto  = new Producto(almacen_stock, stock);

            System.out.print("Ingresa la cantidad a retirar: ");
            int nro_retirar = scanner.nextInt();
            scanner.nextLine();
            p1.retirar(nro_retirar);
            System.out.println("Codigo: " + p1.getCodigo() + ", " + "Stock: " + p1.getStock());

            System.out.print("Ingresa la cantidad a ingresar: ");
            int nro_ingresar = scanner.nextInt();
            scanner.nextLine();
            p1.ingresar(nro_ingresar);
            System.out.println("Codigo: " + p1.getCodigo() + ", " + "Stock: " + p1.getStock());


             */
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        pedirDatos(scanner);
    }
}
