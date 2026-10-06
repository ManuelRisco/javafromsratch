package clase_4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(leerEntero(scanner));
    }
    public static int leerEntero(Scanner scanner){

        while (true){
            System.out.print("Ingresa tu número: ");
            String entrada = scanner.nextLine().trim();
            try {
                return (Integer.parseInt(entrada));
            } catch (NumberFormatException e){
                System.out.println("Escribe un entero válido.");
            }
        }
    }
}
