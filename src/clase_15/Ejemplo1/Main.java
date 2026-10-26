package clase_15.Ejemplo1;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SocioDTO> lista = List.of(new SocioDTO("Manuel", "Pierna", 2000.0),
                                        new SocioDTO("Fabrizzio", "Pecho", 1000.0),
                                        new SocioDTO("Piero", "Brazo", 1200.0),
                                        new SocioDTO("Angelus", "Espalda", 600));

        List<Double> listaFiltrada1 = lista.stream()
                     .map(SocioDTO::cuotaMensual)
                     .toList();

        List<Double> listaFiltrada2 = lista.stream()
                     .sorted((x, y) -> Double.compare(x.cuotaMensual(), y.cuotaMensual()))
                     .map(SocioDTO::cuotaMensual)
                     .toList();

        List<Double> listaFiltrada3 = lista.stream()
                     .sorted((x, y) -> Double.compare(x.cuotaMensual(), y.cuotaMensual()))
                     .map(SocioDTO::cuotaMensual)
                     .toList().reversed();

        List<Double> listaFiltrada4 = lista.stream()
                     .sorted(Comparator.comparingDouble(SocioDTO::cuotaMensual))
                     .map(SocioDTO::cuotaMensual)
                     .toList();

        List<Double> listaFiltrada5 = lista.stream()
                     .sorted(Comparator.comparing(SocioDTO::disciplina)
                     .thenComparingDouble(SocioDTO::cuotaMensual))
                     .map(SocioDTO::cuotaMensual)
                     .toList();

        System.out.println(listaFiltrada1);
        System.out.println("---");
        System.out.println(listaFiltrada2);
        System.out.println("---");
        System.out.println(listaFiltrada3);
        System.out.println("---");
        System.out.println(listaFiltrada4);
        System.out.println("---");
        System.out.println(listaFiltrada5);
    }
}
