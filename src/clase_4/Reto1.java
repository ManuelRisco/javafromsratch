package clase_4;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ejericio1(scanner);
        //ejercicio2(scanner);
        ejercicio3();
    }

    public static void ejericio1(Scanner scanner) {
        System.out.println("Ingresa un numero mayor a 0");
        int nro = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= 12; i++) {
            System.out.println((nro + " x " + i + " = " + nro * i));
        }
    }
    public static void ejercicio2(Scanner scanner){
        int nota = 0;
        double acumulador = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Ingresa la nota N_" + i);
            nota = scanner.nextInt();
            scanner.nextLine();
            acumulador = acumulador + nota;
        }
        System.out.println(acumulador/5);
    }
    public static void ejercicio3(){
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
