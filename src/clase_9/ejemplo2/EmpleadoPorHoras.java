package clase_9.ejemplo2;

import java.math.BigDecimal;

public class EmpleadoPorHoras extends Empleado{
    double horas;
    BigDecimal pagoHora;

    public EmpleadoPorHoras(String nombre, String puesto, double horas, BigDecimal pagoHora){
        this.nombre = nombre;
        this.puesto = puesto;
        this.horas = horas;
        this.pagoHora = pagoHora;
        this.sueldo = calcularSueldo();
    }
    @Override
    BigDecimal calcularSueldo() {
        return sueldo = pagoHora.multiply(BigDecimal.valueOf(horas)).multiply(new BigDecimal(30));
    }
    @Override
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " Puesto: " + puesto + " Horas: " + horas + " PagoHora: " + pagoHora + " Sueldo: " + sueldo);
    };
}
