package clase_4;

import java.util.Scanner;

public class Calculadora {
    double nro_1;
    double nro_2;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculadora c1 = new Calculadora();

        mostrarMenu(scanner, c1);
    }
    public static void pedirDatos(Scanner scanner, Calculadora calculadora){
        while (true)
        {
            try {
                System.out.println("Ingresa el primer numero");
                calculadora.nro_1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Ingresa el segundo numero");
                calculadora.nro_2 = scanner.nextDouble();
                scanner.nextLine();

                return;
            } catch (Exception e){
                System.out.println("Hubo un error... ingresa datos correctos" + e);
                scanner.nextLine();
            }
        }
    }
    public static void mostrarMenu(Scanner scanner, Calculadora calculadora){
        System.out.println("---CALCULADORA---");
        // bucle
        while (true){
            try {

                System.out.println("1. Sumar \n2. Resta \n3. Multiplicar \n4. Dividir \n0. Salir");
                String opcion = scanner.nextLine().trim();

                switch (Integer.parseInt(opcion)){
                    case 0 -> {
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    case 1 -> {
                        pedirDatos(scanner, calculadora);
                        calculadora.sumar();
                    }
                    case 2 -> {
                        pedirDatos(scanner, calculadora);
                        calculadora.resta();
                    }
                    case 3 -> {
                        pedirDatos(scanner, calculadora);
                        calculadora.multiplicacion();
                    }
                    case 4 -> {
                        pedirDatos(scanner, calculadora);
                        calculadora.division();
                    }
                    default -> System.out.println("Ingresa un valor correcto");
                }
            } catch (Exception e){
                System.out.println("Error..." + e);
            }
        }
    }

    public void sumar(){
        System.out.println(nro_1 + nro_2);
    }
    public void resta(){
        System.out.println(nro_1 - nro_2);
    }
    public void multiplicacion(){
        System.out.println(nro_1 * nro_2);
    }
    public void division(){
        if (nro_2 != 0){
            System.out.printf("%.2f%n", nro_1 / nro_2);
            return;
        }
        System.out.println("No se permite el denominador como cero");
    }
}
