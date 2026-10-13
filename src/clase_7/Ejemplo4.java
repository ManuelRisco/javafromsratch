package clase_7;

import java.util.Arrays;

public class Ejemplo4 {
    public static void main(String[] args) {
        String palabra = "HOLAQUEHACE";
        int izq = 0;
        int der = palabra.length() - 1;

        while (izq < der) {
            if (palabra.charAt(izq) != palabra.charAt(der)) {
                System.out.println("No es palindromo");
                return;
            }

            izq++;
            der--;
        }
        System.out.println("Si es palindromo");
    }
}
