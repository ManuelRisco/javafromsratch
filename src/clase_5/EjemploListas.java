package clase_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploListas {
    public static void main(String[] args){
        // inicializar objeto
        EjemploListas ejemploListas = new EjemploListas();
        // Crear una lista que guardara texto String
        ArrayList<String> listaProductos = new ArrayList<>();
        // Inicializar scanner
        Scanner scanner = new Scanner(System.in);

        ejemploListas.agregarDatos(scanner, listaProductos);
        ejemploListas.listarLista(listaProductos);

    }
    public void agregarDatos(Scanner scanner, ArrayList<String> listaProductos){
        System.out.print("Ingresa la cantidad de datos que vas agregar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidad ; i++) {
            System.out.print("Ingresa el producto " + i + ": " );
            String producto = scanner.nextLine();
            listaProductos.add(producto);
        }
    }
    public void listarLista(ArrayList<String> listaProductos){

        System.out.println("---LISTA DE PRODUCTOS---");
        for (int i = 0; i < listaProductos.size() ; i++) {
            System.out.println("Producto " + (i+1) + ": " + listaProductos.get(i));
        }
    }
}
