package clase_9.ejemplo3_10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        mostrarMenu(scanner, empleados);
    }

    public static void mostrarMenu(Scanner scanner, ArrayList<Empleado> empleados) {

        while (true) {
            try {
                System.out.println("---MOSTRANDO MENU---");
                System.out.println(" 0. Salir. \n 1. Listar empleados. \n 2. Ingresar Empleado fijo. \n 3. Ingresar Empleado por Horas. \n 4. Ingresar Empleado por comisión");

                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 0: {
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    }
                    case 1: {
                        Empleado.listarEmpleados(empleados);
                        break;
                    }
                    case 2: {
                        EmpleadoFijo empF = EmpleadoFijo.pedirDatosFijo(scanner);
                        Empleado.insertarEmpleados(empF, empleados);
                        break;
                    }
                    case 3: {
                        EmpleadoHora empH = EmpleadoHora.pedirDatosHora(scanner);
                        Empleado.insertarEmpleados(empH, empleados);
                        break;
                    }
                    case 4: {
                        EmpleadoComision empC = EmpleadoComision.pedirComision(scanner);
                        Empleado.insertarEmpleados(empC, empleados);
                        break;
                    }
                    default: {
                        System.out.println("Ingrese una opcion valida");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese únicamente valores enteros");
                scanner.nextLine();
            } catch (Exception e){
                System.out.println("Error " + e);
                scanner.nextLine();
            }
        }
    }
}