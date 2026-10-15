package clase_9.ejemplo3;

import java.math.BigDecimal;

public class EmpleadoComision extends Empleado{
    double comision;
    BigDecimal venta;
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
    void mostrarInformacion(){
        System.out.println("Puesto: " + puesto + " venta: " + venta + " comision: " + comision + " sueldo: " + sueldo);
    }
}
