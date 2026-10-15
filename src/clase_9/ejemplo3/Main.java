package clase_9.ejemplo3;

import clase_9.ejemplo2.EmpleadoPorHoras;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = {};
    }
    public static void mostrarMenu(){
        System.out.println("MOSTRANDO MENU");
    }
    public static EmpleadoFijo pedirDatosFijo(Scanner scanner){
        System.out.println("EMPLEADO FIJO");
        System.out.print("Puesto: ");
        String puesto = scanner.nextLine();

        System.out.print("Sueldo: ");
        BigDecimal sueldo = scanner.nextBigDecimal();
        scanner.nextLine();

        return new EmpleadoFijo(puesto, sueldo);
    }
    public static EmpleadoPorHoras pedirDatosHora(Scanner scanner){
        System.out.println("EMPLEADO COMISION");
        System.out.print("Puesto: ");
        String puesto = scanner.nextLine();

        System.out.print("Hora: ");
        BigDecimal sueldo = scanner.nextBigDecimal();
        scanner.nextLine();
// mañana sigo wn
        return new EmpleadoFijo(puesto, sueldo);

        this.puesto = puesto;
        this.hora = hora;
        this.pago = pago;
        this.sueldo = calcularSueldo();
    }
    public static void pedirComision(Scanner scanner){
        System.out.println("EMPLEADO HORA");
    }
}
