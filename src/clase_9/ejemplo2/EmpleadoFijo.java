package clase_9.ejemplo2;

import java.math.BigDecimal;

public class EmpleadoFijo extends Empleado{

    public EmpleadoFijo(String nombre, String puesto, BigDecimal sueldo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    @Override
    BigDecimal calcularSueldo(){
        return sueldo;
    };
    @Override
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " Puesto: " + puesto + " Sueldo: " + sueldo);
    };
}
