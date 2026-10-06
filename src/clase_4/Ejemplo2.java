package clase_4;

public class Ejemplo2 {
    public static void main(String[] args){
        double total = multiplicar(8.4, 6.3);
        mostrarResultado(total);
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static void mostrarResultado(double resultado){
        System.out.println("Resultado: " + resultado);
    }
}
