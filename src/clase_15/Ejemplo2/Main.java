package clase_15.Ejemplo2;

import clase_15.Ejemplo1.SocioDTO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SocioDTO> lista = List.of(new clase_15.Ejemplo1.SocioDTO("Manuel", "Pierna", 2000.0),
                new clase_15.Ejemplo1.SocioDTO("Fabrizzio", "Pecho", 1000.0),
                new clase_15.Ejemplo1.SocioDTO("Piero", "Brazo", 1200.0),
                new SocioDTO("Angelus", "Espalda", 600));

        long cantidad = lista.stream()
                .filter(s -> s.disciplina().equals("Pecho"))
                .count();
    }
}
