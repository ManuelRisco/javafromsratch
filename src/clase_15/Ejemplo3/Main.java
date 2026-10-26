package clase_15.Ejemplo3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Listas
        List<Socio> socios = List.of(
                new Socio("123", "Manuel", "Pierna", 80),
                new Socio("456", "Carlos", "Pecho", 100),
                new Socio("789", "Ana", "Pierna", 90),
                new Socio("321", "Luis", "Espalda", 70),
                new Socio("654", "Maria", "Pecho", 110),
                new Socio("987", "Pedro", "Pierna", 120),
                new Socio("741", "Lucia", "Espalda", 95),
                new Socio("852", "Diego", "Pecho", 60),
                new Socio("963", "Sofia", "Pecho", 100),
                new Socio("159", "Jorge", "Espalda", 85)
        );
        // Reporte de socios premium
        List<Socio> listaFiltradaSocio = socios.stream()
                .filter(s -> s.disciplina().equals("Pecho") && s.cuotaMensual() >= 90)
                .sorted(Comparator.comparing(Socio::disciplina).reversed()
                        .thenComparingDouble(Socio::cuotaMensual))
                .toList();

        System.out.println(listaFiltradaSocio);

        // Lista de nombres
        List<String> listaFiltradaSocioNombre = listaFiltradaSocio.stream()
                .map(Socio::nombre).toList();

        System.out.println(listaFiltradaSocioNombre);

        // Cantidad por disciplina

        Map<String, Long> listaCantidadDisciplina = socios.stream()
                .collect(Collectors.groupingBy(Socio::disciplina, Collectors.counting()));

        System.out.println(listaCantidadDisciplina);

        // Ingresos mensuales por disciplina

        Map<String, Double> ingresosMensualesDisciplina = socios.stream()
                .collect(Collectors.groupingBy(Socio::disciplina, Collectors.summingDouble(Socio::cuotaMensual)));

        System.out.println(ingresosMensualesDisciplina);

        // Cuota promedio

        Map<String, Double> cuotaPromedio = socios.stream()
                .collect(Collectors.groupingBy(Socio::disciplina, Collectors.averagingDouble(Socio::cuotaMensual)));

        System.out.println(cuotaPromedio);

        // Reporte combinado

        List<String> reporteCombinado = socios.stream()
                .filter(s -> !s.disciplina().equals("Pecho") && s.cuotaMensual() > 80)
                .sorted(Comparator.comparing(Socio::disciplina))
                .map(s -> s.nombre() + " | " + s.disciplina() + " | " + s.cuotaMensual())
                .toList();

        System.out.println(reporteCombinado);
    }
}
