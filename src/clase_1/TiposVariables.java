import java.util.Scanner;

public class TiposVariables {
    String nombre;
    int edad;
    double salario;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TiposVariables p1 = new TiposVariables();

        System.out.println("Ingresa tu nombre: ");
        p1.nombre = scanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        p1.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa tu salario: ");
        p1.salario = scanner.nextDouble();
        scanner.nextLine();

        mostrarResultado(p1);
        scanner.close();
    }
    public static void mostrarResultado(TiposVariables px){
        System.out.println("Nombre: " + px.nombre);
        System.out.println("Edad: " + px.edad);
        System.out.printf("Salario: %.3f%n ", px.salario);
    }
}
