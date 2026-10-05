package clase_3;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args){
        System.out.println("---Comparaciones---");
        int edad = 22;
        boolean registrado = true;
        boolean permitido = edad >= 18 && registrado;

        System.out.println("Registrado: " + registrado);
        System.out.println("Permitido: " + permitido);
        cortoCircuito();
        compararTexto();
    }
    public static void cortoCircuito(){
        int divisor = 10;
        int total = 30;
        if (divisor !=0 && total / divisor > 2){
            System.out.println("Resultado mayor que dos");
        }
    }

    public static void compararTexto(){
        String expli = "StrIng CReado";
        System.out.println(expli);

        String creado = new String("string creado");
        System.out.println(creado);
        System.out.println(creado.equals(expli));
    }
}
