package clase_9.ejemplo3_10;

import java.math.BigDecimal;
import java.util.Scanner;

public class EmpleadoFijo extends Empleado{
    public EmpleadoFijo(){};
    public EmpleadoFijo(String puesto, BigDecimal sueldo){
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    @Override
    BigDecimal calcularSueldo(){
        return sueldo;
    };
    @Override
    String mostrarInformacion(){
        return "Empleado Fijo - puesto: " + puesto + ", sueldo: " + sueldo;
    }

    static EmpleadoFijo pedirDatosFijo(Scanner scanner){
        System.out.println("EMPLEADO FIJO");
        System.out.print("Puesto: ");
        String puesto = scanner.nextLine();

        System.out.print("Sueldo: ");
        BigDecimal sueldo = scanner.nextBigDecimal();
        scanner.nextLine();

        return new EmpleadoFijo(puesto, sueldo);
    }
}
