package clase_9.ejemplo3;

import java.math.BigDecimal;

public class EmpleadoFijo extends Empleado{
    public EmpleadoFijo(String puesto, BigDecimal sueldo){
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    @Override
    BigDecimal calcularSueldo(){
        return sueldo;
    };
    @Override
    void mostrarInformacion(){
        System.out.println("puesto: " + puesto + " sueldo: " + sueldo);
    }
}
