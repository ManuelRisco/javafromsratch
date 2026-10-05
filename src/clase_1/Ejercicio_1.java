import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        calculadora(scanner);
        scanner.close();
    }
    public static void calculadora(Scanner scanner) {

        Producto pr1 = new Producto();
        Pesaje pe1 = new Pesaje();

        while (true) {

            System.out.println("---CALCULADORA---");
            System.out.println("0. Salir");
            System.out.println("1. Producto");
            System.out.println("2. Pesaje");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 0:

                case 1:
                    pedirProducto(scanner, pr1);
                    break;
                case 2:
                    pedirPesaje(scanner, pe1);
                    break;
                default:
                    System.out.println("Ingrese datos validos");
                    break;
            }
        }
    }
    public static class Producto{
        String nombre;
        double precio;
        int stock;
    }
    public static class Pesaje{
        double peso;
        double tara;
        double neto;
    }
    public static void pedirProducto(Scanner scanner, Producto prx){
        while (true){
            try {
                System.out.print("Ingrese nombre: ");
                 prx.nombre = scanner.nextLine();

                System.out.print("Ingrese precio: ");
                prx.precio = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Ingrese stock: ");
                prx.stock = scanner.nextInt();
                scanner.nextLine();

                mostrarResultadosProducto(prx);
                return;

            } catch (Exception e) {
                System.out.println("Error...");
                scanner.nextLine();
            }
        }
    }
    public static void pedirPesaje(Scanner scanner, Pesaje pex){
        while (true){
            try {
                System.out.print("Ingrese peso: ");
                pex.peso = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Ingrese tara: ");
                pex.tara = scanner.nextDouble();
                scanner.nextLine();

                pex.neto = pex.peso - pex.tara;

                mostrarResultadosPesaje(pex);
                return;

            } catch (Exception e) {
                System.out.println("Error...");
                scanner.nextLine();
            }
        }
    }
    public static void mostrarResultadosProducto(Producto prx){
        System.out.println("---DATOS INGRESADOS CON EXITO---");
        System.out.println("Nombre: " + prx.nombre);
        System.out.println("Precio: " + prx.precio);
        System.out.println("Stock: " + prx.stock);
    }
    public static void mostrarResultadosPesaje(Pesaje pex){
        System.out.println("---DATOS INGRESADOS CON EXITO---");
        System.out.println("Peso: " + pex.peso);
        System.out.println("Tara: " + pex.tara);
        System.out.println("Neto: " + pex.neto);
    }
    public static void salirPrograma(){
        System.out.println("Programa finalizado...");
    }

}
