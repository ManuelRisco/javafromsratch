package clase_17.Ejemplo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo2/texto.txt");
        Files.write(
                ruta,
                List.of("Spring Boot"),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
}
