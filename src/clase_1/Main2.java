import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 inicializar = new Main2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Ingresa el valor de B: ");
        double b = scanner.nextDouble();

        inicializar.Suma(a,b);
        inicializar.Resta(a,b);
        inicializar.Multiplicacion(a,b);
        inicializar.Division(a,b);

    }

    public void Suma(double a, double b){
        double c = a + b;
        Mostrar_Resultado(c);
    }

    public void Resta(double a, double b){
        if (b > a){
            System.out.println("---Aviso: La resta va a salir negativa---");
        }
        double c = a - b;
        Mostrar_Resultado(c);
    }
    public void Multiplicacion(double a, double b){
        double c = a * b;
        Mostrar_Resultado(c);
    }
    public void Division(double a, double b){
        if (b == 0){
            System.out.println("No sé puede dividir un número entre cero");
            return;
        }
        double c = a / b;
        Mostrar_Resultado(c);
    }
    public static void Mostrar_Resultado(double c){
        System.out.println("Resultado: "+c);
    }
}