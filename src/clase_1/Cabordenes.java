import java.util.Scanner;

public class Cabordenes {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cabordenes c1 = new Cabordenes();

        System.out.println("Iniciando el programa...");
        String a = c1.PedirDatos(scanner);
        MostrarDatos(a);
    }

    public String PedirDatos(Scanner scanner) {
        while (true) {
                System.out.print("Ingresa el emp_codigo: ");
                String codigo = scanner.nextLine();

                if (!codigo.isBlank() && !codigo.isEmpty()) {
                    return codigo;
                }
                System.out.println("El codigo no puede estar vacio");
        }
    }
    public static void MostrarDatos(String a){
        System.out.println("emp_codigo: " + a);
    }
}
