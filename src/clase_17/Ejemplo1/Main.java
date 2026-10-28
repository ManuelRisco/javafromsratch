package clase_17.Ejemplo1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo1/archivo.txt");
        var lineas = List.of(
                "Fabrizzio",
                "Risco",
                "22",
                "Sistemas"
        );
        Files.write(ruta, lineas);

        System.out.println(Files.readAllLines(ruta));
    }
}
