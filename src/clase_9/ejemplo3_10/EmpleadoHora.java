package clase_9.ejemplo3_10;

import java.math.BigDecimal;
import java.util.Scanner;

public class EmpleadoHora extends Empleado{
    double hora;
    BigDecimal pago;

    public EmpleadoHora(){};
    public EmpleadoHora(String puesto, double hora, BigDecimal pago ){
        this.puesto = puesto;
        this.hora = hora;
        this.pago = pago;
        this.sueldo = calcularSueldo();
    }
    @Override
    BigDecimal calcularSueldo(){
        return pago.multiply(BigDecimal.valueOf(hora)).multiply(BigDecimal.valueOf(30));
    };
    @Override
    String mostrarInformacion(){
        return "Empleado hora - puesto: " + puesto + ", hora: " + hora + ", pago: " + pago + ", sueldo: " + sueldo;
    }
    static EmpleadoHora pedirDatosHora(Scanner scanner){
        System.out.println("EMPLEADO HORA");
        System.out.print("Puesto: ");
        String puesto = scanner.nextLine();

        System.out.print("Hora: ");
        double hora = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Pago: ");
        BigDecimal pago = scanner.nextBigDecimal();
        scanner.nextLine();

        return new EmpleadoHora(puesto, hora, pago);
    }
}
