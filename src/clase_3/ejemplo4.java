package clase_3;

import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        condicionalWhile();
        System.out.println("---------------");
        condicionalDoWhile();
        System.out.println("---------------");
        menuDoWhile(scanner);
    }

    public static void condicionalWhile() {
        int contador = 1;
        while (contador <= 3) {
            System.out.println(contador);
            contador++;
        }
    }

    public static void condicionalDoWhile() {
        int numero = 5;
        do {
            System.out.println(numero);
            numero++;
        } while (numero < 3);
    }

    public static void menuDoWhile(Scanner scanner) {
        int opcion;
        do {
            System.out.println("1. Saludar | 0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Hola");
                case 0 -> {
                    System.out.println("Hasta luego");
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}
