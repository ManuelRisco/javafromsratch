package clase_4;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int edad = pedirDatos(scanner);
        System.out.print(edad);
    }

    public static int pedirDatos(Scanner scanner){
        while (true){
            System.out.print("Ingrese su edad | (0 - 120): ");
            String edad = scanner.nextLine().trim();
            try {
                if (Integer.parseInt(edad) >= 0 && Integer.parseInt(edad) <= 120){
                    return Integer.parseInt(edad);
                }
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero entero");
            }
        }
    }
}
