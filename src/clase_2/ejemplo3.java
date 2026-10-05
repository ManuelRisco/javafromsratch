package clase_2;

import java.util.Locale;
import java.util.Scanner;

// nombre, edad, carrera
public class ejemplo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---CLASE 4 - ENTRADA CON SCANNER---");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("SU NOMBRE: " + nombre.toUpperCase() + ", SU EDAD: " + edad + ", SU CARRERA: " + carrera.toUpperCase());
    }
}
