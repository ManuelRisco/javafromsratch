package clase_13.Ejemplo7;

import java.util.Comparator;
import java.util.List;

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

        List<Socio> datosFiltrados = socios.stream()
                .filter(s -> (s.cuotaMensual() >= 80) && !(s.disciplina().equals("Espalda")))
                .sorted(Comparator.comparingDouble((Socio s) -> s.cuotaMensual()).reversed())
                .toList();

        // mostrar socios con su Formato que pide
        List<String> formato = datosFiltrados.stream()
                .map(s -> s.nombre() + " - " + s.disciplina() + " - " + " S/ " + s.cuotaMensual())
                .toList();

        System.out.println(formato);

        // sumatoria de los datos
        double sumatoria = datosFiltrados.stream()
                .mapToDouble(s -> s.cuotaMensual())
                .sum();

        System.out.println(sumatoria);
    }
}
