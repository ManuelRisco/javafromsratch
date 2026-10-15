package clase_9.ejemplo1;

import java.math.BigDecimal;

public class Empleado {
    String nombre;
    BigDecimal sueldo;

    void presentarse(){
        System.out.println("Mi nombre es: " + nombre + " y mi sueldo es: " + sueldo);
    }
}
