package clase_8;

public class Ejemplo2 {
    public static void main(String[] args) {
        int[][] numeros = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };
        int suma = 0;
        int tm = numeros.length;

        for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i][numeros.length- 1 - i];
            }
        System.out.println("");
        System.out.println(suma);
    }
}