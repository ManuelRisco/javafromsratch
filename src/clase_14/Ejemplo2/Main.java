package clase_14.Ejemplo2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SocioDTO> socios = List.of(new SocioDTO("Manuel", "Pierna", 100.0),
                new SocioDTO("Fabrizzio", "Pecho", 120.0));

        List<String> datosFiltrados = socios.stream()
                .filter(s -> s.cuotaMensual() >= 101)
                .map(SocioDTO::nombre)
                .toList();

        System.out.println(datosFiltrados);

        List<String> listaFiltrada = socios.stream()
                .sorted((s1, s2) -> Double.compare(s1.cuotaMensual(), s2.cuotaMensual()))
                .map(SocioDTO::nombre)
                .toList();

        System.out.println(listaFiltrada);

        List<String> listaFiltradaInvetida = listaFiltrada.reversed();

        System.out.println(listaFiltradaInvetida);
    }
}
