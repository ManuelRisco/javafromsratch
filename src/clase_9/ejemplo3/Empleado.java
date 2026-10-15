package clase_9.ejemplo3;

import java.math.BigDecimal;

public abstract class Empleado {
    String puesto;
    BigDecimal sueldo;

    abstract BigDecimal calcularSueldo();
    void calculoGeneral(){
        System.out.println("Sueldo: " + calcularSueldo());
    }
    abstract void mostrarInformacion();
}
