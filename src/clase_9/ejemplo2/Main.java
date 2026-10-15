package clase_9.ejemplo2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Empleado[] empleados = {
                new EmpleadoFijo(
                        "Fabrizzio",
                        "Sistemas",
                        new BigDecimal("4500.47"))
                ,new EmpleadoPorHoras(
                        "Fabrizzio",
                        "Sistemas",
                        6, new BigDecimal("10"))
                ,new EmpleadoPorHoras(
                        "Ana",
                        "Soporte",
                        8, new BigDecimal("15"))
        };
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

    }
}
