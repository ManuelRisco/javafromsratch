package clase_10.CajeroAutomatico;

import java.util.ArrayList;
import java.util.List;

public class Distrito {
    private static final List<Distrito> REGISTRO_GLOBAL = new ArrayList<>();
    private String nombre;

    public Distrito(String nombre){
        setNombre(nombre);
        REGISTRO_GLOBAL.add(this);
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del distrito no se puede agregar");
        }
        String nombreLimpio = nombre.trim();

        for (Distrito d : REGISTRO_GLOBAL){
            if (d != this && d.getNombre().equalsIgnoreCase(nombreLimpio)){
                throw new IllegalArgumentException("No se aceptan duplicados");
            }
        }

        this.nombre = nombreLimpio;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString() {
        return "Distrito{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
