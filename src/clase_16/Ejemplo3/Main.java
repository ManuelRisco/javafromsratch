package clase_16.Ejemplo3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args){
        Path ruta = Path.of("src/clase_16/Ejemplo3/texto.txt");
        // Files.writeString(ruta, "Mi primera persistencia en Java");
        // System.out.println("Archivo guardado correctamente");
        try {
            // System.out.println("Leyendo...");
            // String contenido = Files.readString(ruta);
            // System.out.println(contenido);

            System.out.println("Leyendo linea por linea");
            var lineas = Files.readAllLines(ruta);
            lineas.forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Error... no se pudo leer el archivo");
        }

    }
}
