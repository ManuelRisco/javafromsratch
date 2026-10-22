package clase_13.Ejemplo5;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Socio> socios = List.of(
                new Socio("123", "Manuel", "Pierna", 80.0),
                new Socio("456", "Carlos", "Pecho", 100.0),
                new Socio("789", "Ana", "Pierna", 90.0),
                new Socio("321", "Luis", "Espalda", 70.0),
                new Socio("654", "María", "Pecho", 110.0)
        );

        List<String> sociosPecho = socios.stream()
                    .filter(s -> (s.disciplina().equals("Pierna") && (s.cuotaMensual() >= 85)))
                    .map(s -> s.nombre())
                    .toList();

        System.out.println(sociosPecho);


        List<String> nombresOrdenados = socios.stream()
                .map(s -> s.nombre())
                .sorted()
                .toList();

        System.out.println(nombresOrdenados);
    }
}
