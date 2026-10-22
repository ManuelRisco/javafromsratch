package clase_13.Ejemplo8;

import clase_13.Ejemplo6.Socio;

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

        List<SocioDTO> response = socios.stream()
                .map(s -> new SocioDTO
                        (s.nombre(),
                         s.disciplina(),
                         s.cuotaMensual()))
                .toList();

        response.forEach(s -> System.out.println(s.nombre() + " | " + s.disciplina() + " | " + s.cuotaMensual()));
    }
}
