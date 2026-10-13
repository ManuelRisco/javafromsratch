package clase_7;


import java.util.Arrays;

public class Ejemplo3 {
    public static void main(String[] args){
        int[] numeros = {10, 20, 30, 40, 50};
        int izq = 0;
        int der = numeros.length - 1;

        while (izq < der){
            int temp = numeros[izq];
            numeros[izq] = numeros[der];
            numeros[der] = temp;

            izq++;
            der--;
        }
        System.out.println(Arrays.toString(numeros));
    }
}