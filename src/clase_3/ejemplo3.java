package clase_3;

import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 2;
        switch (opcion) {
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            default:
                System.out.println("Default");
        }
        menu(scanner);
        scanner.close();
    }
        public static void menu(Scanner scanner){
        while (true){

            System.out.println("Ingrese un valor del 1 al 4");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> System.out.println("Suma");
                case 2 -> System.out.println("Resta");
                case 3 -> System.out.println("Multiplicacion");
                case 4 -> System.out.println("Division");
                case 0 -> {
                    System.out.println("Saliendo del programa");
                    return;
                }
            }
        }
    }
}
