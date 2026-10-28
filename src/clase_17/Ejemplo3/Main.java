package clase_17.Ejemplo3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo3/personas.txt");
        Files.write(ruta, List.of(
                "Ana",
                "Java",
                "21"
        ),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        Files.write(ruta, List.of("Pedro"),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println(Files.readAllLines(ruta));

    }
}
