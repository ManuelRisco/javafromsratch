package clase_17.Ejemplo4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo4/personas.txt");
        Files.write(ruta, List.of("Ana,Java,21",
                "Pedro,Spring Boot,25",
                "Lucia,SQL,22"));

        var lineas = Files.readAllLines(ruta);

        for (String linea : lineas) {
            String[] partes = linea.split(",");

            System.out.println("Nombre: " + partes[0]);
            System.out.println("Tecnologia: " + partes[1]);
            System.out.println("Edad: " + partes[2]);
            System.out.println("---");
        }

    }
}
