import java.util.Scanner;

public class Prd_detpesa {
    String emp_codigo;
    String pesaje;
    double peso;
    double tara;
    double neto;
    char tipo;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prd_detpesa ps1 = new Prd_detpesa();
        ps1.pedirDatos(scanner);
        mostrarObjeto(ps1);
    }

    public void pedirDatos(Scanner scanner) {
        System.out.print("Ingresa emp_codigo: ");
        this.emp_codigo = scanner.nextLine();

        System.out.print("Ingresa pesaje: ");
        this.pesaje = scanner.nextLine();

        System.out.print("Ingresa peso: ");
        this.peso = scanner.nextDouble();

        System.out.print("Ingresa tara: ");
        this.tara = scanner.nextDouble();

        this.neto = this.peso - this.tara;

        System.out.print("Ingresa tipo: ");
        this.tipo = Character.toUpperCase(scanner.next().charAt(0));
    }
    public static void mostrarObjeto(Prd_detpesa psx){
        System.out.println("---MOSTRANDO RESULTADOS DE INSERTAR DATOS AL OBJETO---");
        System.out.println("Codigo: " + psx.emp_codigo);
        System.out.println("Pesaje: " + psx.pesaje);
        System.out.printf("Peso: %.3f%n", psx.peso);
        System.out.printf("Tara: %.3f%n", psx.tara);
        System.out.printf("Neto: %.3f%n", psx.neto);
        System.out.println("Tipo: " + psx.tipo);
    }
}


