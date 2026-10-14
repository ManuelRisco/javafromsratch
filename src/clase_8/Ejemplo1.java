package clase_8;

import java.util.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 8, 0, 6, -9, 4, 1};

        boolean huboCambio = true;

        // Repetimos todo el proceso mientras sigamos encontrando desorden
        while (huboCambio) {
            huboCambio = false; // Asumimos que ya está ordenado

            for (int i = 0; i < numeros.length - 1; i++) {
                // Si encontramos una pareja desordenada, la cambiamos
                if (numeros[i] < numeros[i + 1]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;

                    // Avisamos que la lista todavía no estaba lista
                    huboCambio = true;
                }
            }
        }

        System.out.println("Ordenado descendente: " + Arrays.toString(numeros));
    }
}