import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main3 inicializar = new Main3();
        double a = inicializar.pedirNumero(scanner, "A");
        double b = inicializar.pedirNumero(scanner, "B");

        // Bucle del menu
        while (true) {
            // MENU INTERACTIVO
            System.out.println("---Menu interactivo---");
            System.out.println("Elige una opcion: ");
            System.out.println("1. Mostrar valores\n2. Cambiar valores\n3. Suma \n4. Resta \n5. Multiplicacion \n6. Division\n0. Salir");
            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No se permiten letras");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 0:
                    System.out.println("Salir");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("Valores: \n A = " + a + "\n B = " + b);
                    break;
                case 2:
                    a = inicializar.pedirNumero(scanner, "A");
                    b = inicializar.pedirNumero(scanner, "B");
                    break;
                case 3:
                    System.out.println("Suma: " + inicializar.suma(a, b));
                    break;
                case 4:
                    System.out.println("Resta: " + inicializar.resta(a, b));
                    break;
                case 5:
                    System.out.println("Multiplicacion: " + inicializar.multiplicacion(a, b));
                    break;
                case 6:
                    if (b == 0) {
                        System.out.println("No sé puede dividir entre 0");
                        break;
                    }
                    System.out.println("Division: " + inicializar.division(a, b));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        if (b > a) {
            System.out.println("---Aviso: La resta va a salir negativa---");
        }
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

        public double pedirNumero(Scanner scanner, String valor) {
            while (true) {
                try {
                    System.out.println("Ingresa el valor de " + valor + ": ");
                    return scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Solo se permiten números.");
                    scanner.nextLine();
                }
            }
        }
}