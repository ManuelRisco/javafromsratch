package clase_7;

import java.util.Arrays;

public class Ejemplo2 {
    public static void main(String[] args){
        int[] numeros = {14,3,89,1,45,99,23};
        System.out.println("ENCONTRAR EL MAYOR Y MENOR DE UN ARRAY");
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
