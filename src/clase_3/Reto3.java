package clase_3;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedirDatos(scanner);
    }

    public static void pedirDatos(Scanner scanner) {

        while (true) {
            System.out.println("Ingrese un número entero positivo");
            int nx = scanner.nextInt();
            scanner.nextLine();

            if ((nx > 0) && (nx % 1 == 0)){
                calcular(nx);
                break;
            }

        }
    }

    public static void calcular(int nx) {
            System.out.println(nx * 2);
    }
}
