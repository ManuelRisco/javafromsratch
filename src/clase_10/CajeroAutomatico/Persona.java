package clase_10.CajeroAutomatico;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombres;
    private String ape_paterno;
    private String ape_materno;
    private int edad;

    public Persona(){};
    public Persona(String nombres, String ape_paterno, String ape_materno, int edad){
        setNombres(nombres);
        setApe_Pat(ape_paterno);
        setApe_Mat(ape_materno);
        setEdad(edad);
    }

    public void setNombres(String nombres){
        if (nombres.isBlank()){
            throw new IllegalArgumentException("Inserte un dato valido");
        } else {
            this.nombres = nombres.trim().toUpperCase();
        }
    }

    public void setApe_Pat(String ape_paterno){
        if (ape_paterno.isBlank()){
            throw new IllegalArgumentException("Inserte un dato valido");
        } else {
            this.ape_paterno = ape_paterno.trim().toUpperCase();
        }
    }
    public void setApe_Mat(String ape_materno){
        if (ape_materno.isBlank()){
            throw new IllegalArgumentException("Inserte un dato valido");
        } else {
            this.ape_materno = ape_materno.trim().toUpperCase();
        }
    }
    public void setEdad(int edad){
        if (edad >= 18 && edad < 130){
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Ingrese un dato valido");
        }
    }

    public String getNombres() {
        return nombres;
    }
    public String getApe_paterno() {
        return ape_paterno;
    }
    public String getApe_materno() {
        return ape_materno;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", ape_paterno='" + ape_paterno + '\'' +
                ", ape_materno='" + ape_materno + '\'' +
                ", edad=" + edad +
                '}';
    }
}
