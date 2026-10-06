package clase_3;

import java.util.Scanner;

public class Persona {
    // ATRIBUTOS DE LA CLASE PERSONA
    String nombre;
    String puesto;
    boolean esAdmin;

    public static void main(String[] args){
        // INICIALIZAR SCANNER
        Scanner scanner = new Scanner(System.in);
        // INICIALIZAR PERSONA
        Persona p1 = new Persona();
        System.out.println("---SISTEMA DE TICKETS---");
        pedirDatos(scanner, p1);
        mostrarDatos(p1);
    }

    public static void pedirDatos(Scanner scanner, Persona px){
        // INICIALIZAR OBJETO PERSONA

        // PEDIR DATOS PERSONALES
        System.out.print("Ingrese su nombre: ");
        px.nombre = scanner.nextLine();

        System.out.print("Ingrese su puesto: ");
        px.puesto = scanner.nextLine();

        System.out.print("Eres admin? escriba true o false: ");
        px.esAdmin = scanner.nextBoolean();
    }

    public static void mostrarDatos(Persona px){
        System.out.println("Su nombre es: " + px.nombre);
        System.out.println("Su puesto es: " + px.puesto);
        verificarAdmin(px);
    }

    public static void verificarAdmin(Persona px){
        if (px.esAdmin){
            System.out.println("Usted es admin");
        } else {
            System.out.println("Usted no es admin");
        }
    }
}
