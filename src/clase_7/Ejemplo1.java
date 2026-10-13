package clase_7;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---INICIO DEL PROGRAMA---");
        int cantidad = pedirDatos(scanner);
        fibonacci(cantidad);
    }
    public static int pedirDatos(Scanner scanner) {
        System.out.print("Ingresa la cantidad de numero que desea imprimir: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        return cantidad;
    }
    public static void fibonacci(int limite){
        System.out.println("---FIBONACCI---");
        int lx = 0;
        int ly = 1;
        int acumulativo;

        for (int i = 0; i < limite; i++) {
            System.out.println(lx);
            acumulativo = lx + ly;
            lx = ly;
            ly = acumulativo;
        }
    }
}
