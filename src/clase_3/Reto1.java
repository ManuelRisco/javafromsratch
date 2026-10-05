package clase_3;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Reto 1---");
        decision(scanner);
        scanner.close();
    }

    public static void decision(Scanner scanner){
        while (true){
        System.out.print("Ingrese la cantidad: ");
        int cant_ejem = scanner.nextInt();
        scanner.nextLine();

            if (cant_ejem <= 0){
                System.out.println("Ingresa un valor mayor a 0");
            } else if (cant_ejem <= 4){
                System.out.println("Pedido pequeño");
                return;
            } else {
                System.out.println("Pedido grande");
                return;
            }
        }
    }
}
