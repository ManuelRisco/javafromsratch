package clase_9.ejemplo3;

import java.math.BigDecimal;

public class EmpleadoHora extends Empleado{
    double hora;
    BigDecimal pago;
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
    void mostrarInformacion(){
        System.out.println("puesto: " + puesto + " hora: " + hora + " pago: " + pago + " sueldo: " + sueldo);
    }
}
