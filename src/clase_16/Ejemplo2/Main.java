package clase_16.Ejemplo2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("textoCreado");
        Files.writeString(ruta, "Hola Mundo");
        System.out.println("Archivo creado");
    }
}
