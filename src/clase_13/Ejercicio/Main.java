package clase_13.Ejercicio;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Socio> socios = List.of(
                new Socio("123", "Manuel", "Pierna", 80.0),
                new Socio("456", "Carlos", "Pecho", 100.0),
                new Socio("789", "Ana", "Pierna", 90.0),
                new Socio("321", "Luis", "Espalda", 70.0),
                new Socio("654", "Maria", "Pecho", 110.0),
                new Socio("987", "Pedro", "Pierna", 120.0),
                new Socio("741", "Lucia", "Espalda", 95.0),
                new Socio("852", "Diego", "Pecho", 60.0)
        );

        // Filtrar y ordenar
        List<Socio> datosFiltrado = socios.stream()
                .filter(s -> (s.cuotaMensual() >= 80) && !(s.disciplina().equals("Espalda")))
                .sorted(Comparator.comparingDouble((Socio s)-> s.cuotaMensual()).reversed())
                .toList();

        System.out.println(datosFiltrado);

        // Transformar datos
        List<String> reporte = datosFiltrado.stream()
                .map(s -> s.nombre() + " - " + s.disciplina() + " - " + " S/" + s.cuotaMensual())
                .toList();

        System.out.println(reporte);

        // Operaciones númericas
        double sumatoria = datosFiltrado.stream()
                .mapToDouble(s -> s.cuotaMensual())
                .sum();

        double promedio = datosFiltrado.stream()
                .mapToDouble(s -> s.cuotaMensual())
                .average().
                orElse(0.0);

        long cantidad = datosFiltrado.stream()
                .count();

        System.out.println("Suma de todas las cuotas de los socios filtrados: " + sumatoria);
        System.out.println("Promedio de las cuotas: " + promedio);
        System.out.println("Cantidad de socios filtrados: " + cantidad);

        Set<String> sinDuplicados = socios.stream()
                .map(s -> s.disciplina())
                .collect(Collectors.toSet());

        System.out.println(sinDuplicados);

        String busquedaSocio = socios.stream()
                .filter(s -> s.cuotaMensual() > 100)
                .map(s -> s.nombre())
                .findFirst().orElse("No se encontro");

        System.out.println(busquedaSocio);
    }
}
