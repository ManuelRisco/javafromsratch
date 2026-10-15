package clase_9.ejemplo2;

import java.math.BigDecimal;

public abstract class Empleado {
    String nombre;
    String puesto;
    BigDecimal sueldo;

    abstract BigDecimal calcularSueldo();
    void calcularEmpleado(){
    calcularSueldo();
    }
    abstract void mostrarInformacion();
}
