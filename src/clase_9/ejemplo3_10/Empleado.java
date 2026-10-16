package clase_9.ejemplo3_10;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Empleado {
    String puesto;
    BigDecimal sueldo;

    abstract BigDecimal calcularSueldo();
    abstract String mostrarInformacion();
    static void insertarEmpleados(Empleado empleado, ArrayList<Empleado> empleados) {
        empleados.add(empleado);
        System.out.println("Empleado ingresado con éxito!");
    }
    static void listarEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay ningún empleado registrado!");
            return;
        }
        int i = 0;
        System.out.println("---Lista de empleados---");
        for (Empleado empleado : empleados) {
            i = i + 1;
            System.out.println("Empleado - (" + i + ") - " + empleado.mostrarInformacion());
        }
    }
}
