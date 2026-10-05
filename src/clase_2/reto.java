package clase_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class reto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nom_pro;
        int cantidad;
        BigDecimal pre_uni;


        System.out.print("Ingresa el nombre del producto: ");
        nom_pro = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        pre_uni = scanner.nextBigDecimal();
        scanner.nextLine();

        BigDecimal sub_total = pre_uni.multiply(BigDecimal.valueOf(cantidad));

        System.out.println("El total de tu compra es: " + sub_total);
    }
}
