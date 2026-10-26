package clase_15.Ejemplo4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // Scanner compartido para que se use en todo el programa
    public static Scanner scanner = new Scanner(System.in);
    public static List<Socio> lista = new ArrayList<>();

    public static void main(String[] args) {
        lista.add(new Socio("76947694", "Manuel", "Pierna", 200.0));
        lista.add(new Socio("42565620", "Mario", "Pecho", 300.0));
        lista.add(new Socio("24466880", "Ana", "Brazo", 100.0));
        menu();

    }


    public static void menu (){
        while (true) {
            System.out.println("========= GIMNASIO =========");
            System.out.println("1. Registrar socio");
            System.out.println("2. Mostrar todos los socios");
            System.out.println("3. Buscar socio por DNI");
            System.out.println("4. Eliminar socio");
            System.out.println("5. Reportes estadísticos");
            System.out.println("0. Salir");
            System.out.println("============================");
            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    lista.add(registrarSocio());
                    break;
                }
                case 2: {
                    System.out.println(mostrarSocio());
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el DNI del socio: ");
                    String dni = scanner.nextLine();
                    Optional<Socio> resultado = buscarSocioDNI(dni);
                    resultado.ifPresentOrElse(System.out::println, () -> System.out.println("No existe un socio con ese DNI"));
                    break;
                }
                case 4: {
                    System.out.print("Ingrese el DNI del socio: ");
                    String dni = scanner.nextLine();
                    eliminarSocioDNI(dni);
                    break;
                }
                case 5: {
                    reportes();
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Opción invalida");
                }
            }
        }
    }
    public static Socio registrarSocio() {
        String dni = "";
        String nombre = "";
        String disciplina = "";
        double cuotaMensual = 0.0;

        // DNI
        while (true){
            System.out.print("Ingrese su dni: ");
            dni = scanner.nextLine().trim();

            if (buscarSocioDNI(dni).isPresent()){
                System.out.println("Ya exite un socio con este DNI asignado");
                continue;
            }
            break;
        }
        // Nombre y disciplina

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su disciplina: ");
        disciplina = scanner.nextLine();

        // Validacion de la cuota Mensual
        while (true){
            try {
                System.out.print("Ingrese su cuota Mensual: ");
                cuotaMensual = scanner.nextDouble();
                scanner.nextLine();

                if (cuotaMensual < 0){
                    System.out.println("No puede ser negativo");
                } else {
                    break;
                }
            } catch (Exception e){
                System.out.println("Error: Ingrese un valor númerico valido");
                scanner.nextLine();
            }
        }
        return new Socio(dni, nombre, disciplina, cuotaMensual);
    }
    public static String mostrarSocio(){
        return lista.stream()
                .map(s -> s.dni() + " | " + s.nombre() + " | " + s.disciplina() + " | " + s.cuotaMensual())
                .collect(Collectors.joining("\n"));
    }
    public static Optional<Socio> buscarSocioDNI(String dni) {
        return lista.stream().filter(s -> s.dni().equals(dni))
                .findFirst();
    }
    public static void eliminarSocioDNI(String dni){
        boolean eliminado = lista.removeIf(s -> s.dni().equals(dni));

        if (!eliminado){
            System.out.println("No se encontro al socio");
        } else {
            System.out.println("Se elimino el socio");
        }
    }
    public static void reportes(){

        if (!lista.isEmpty()){
            Map<String, Long> cantidadDisciplina = lista.stream()
                    .collect(Collectors.groupingBy(Socio::disciplina, Collectors.counting()));

            Map<String, Double> ingresosMensuales = lista.stream()
                    .collect(Collectors.groupingBy(Socio::disciplina, Collectors.summingDouble(Socio::cuotaMensual)));

            Map<String, Double> promedioCuotas = lista.stream()
                    .collect(Collectors.groupingBy(Socio:: disciplina, Collectors.averagingDouble(Socio::cuotaMensual)));

            String sociosOrdenadosCuotas = String.valueOf(lista.stream()
                    .sorted(Comparator.comparingDouble(Socio::cuotaMensual))
                    .map(s -> s.nombre() + " | " + s.cuotaMensual()).toList());

            System.out.println("SISTEMA DE REPORTES");
            System.out.println("Cantidad por disciplina\n" + cantidadDisciplina);
            System.out.println("Ingresos Mensuales\n" + ingresosMensuales);
            System.out.println("Promedio cuotas\n"+ promedioCuotas);
            System.out.println("Socios ordenados por cuotas\n" + sociosOrdenadosCuotas);
        } else {
            System.out.println("No hay usuarios registrados");
        }


    }
}
