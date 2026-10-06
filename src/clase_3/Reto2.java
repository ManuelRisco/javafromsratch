package clase_3;

import java.util.Scanner;

public class Reto2 {
    private String nombre;
    private String puesto;

    public Reto2(){};
    public Reto2(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    @Override
    public String toString(){
        return "Tu nombre es: " + getNombre() + " y tu puesto es: " + getPuesto();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Reto2 r1 = new Reto2();
        r1.setNombre("Manuel");
        r1.setPuesto("Ing. Sistemas");
        System.out.println(r1.toString());
    }

}
