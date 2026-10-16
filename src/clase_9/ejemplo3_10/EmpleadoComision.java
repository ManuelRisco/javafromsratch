package clase_9.ejemplo3_10;

import java.math.BigDecimal;
import java.util.Scanner;

public class EmpleadoComision extends Empleado{
    double comision;
    BigDecimal venta;
    public EmpleadoComision(){};
    public EmpleadoComision(String puesto,BigDecimal venta, double comision){
        this.puesto = puesto;
        this.venta = venta;
        this.comision = comision;
        this.sueldo = calcularSueldo();
    }
    @Override
    BigDecimal calcularSueldo(){
        return BigDecimal.valueOf(comision).multiply(venta);
    };
    @Override
    String mostrarInformacion(){
        return "Empleado Comision - Puesto: " + puesto + ", venta: " + venta + ", comision: " + comision + ", sueldo: " + sueldo;
    }
    static EmpleadoComision pedirComision(Scanner scanner){
        System.out.println("EMPLEADO COMISION");
        System.out.print("Puesto: ");
        String puesto = scanner.nextLine();

        System.out.print("Venta: ");
        BigDecimal venta = scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.print("Comision: ");
        double comision = scanner.nextDouble();
        scanner.nextLine();

        return new EmpleadoComision(puesto, venta, comision);
    }
}
