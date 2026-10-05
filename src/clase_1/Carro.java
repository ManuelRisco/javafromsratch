import java.util.Scanner;

public class Carro {

    public static class Car{
        String modelo;
        int anio;

    }

    public static void main(String[] args){
        // iniciar scanner
        Scanner scanner = new Scanner(System.in);
        // iniciar objeto car
        Car c1 = new Car();
        // pedir datos
        System.out.print("Ingresa el modelo: ");
        c1.modelo = scanner.nextLine();
        System.out.print("Ingresa el año: ");
        c1.anio = scanner.nextInt();
        System.out.println(c1.modelo + " " + c1.anio);
    }
}