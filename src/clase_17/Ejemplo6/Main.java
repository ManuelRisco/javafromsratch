package clase_17.Ejemplo6;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IIOException {
        Path ruta = Path.of("src/clase_17/Ejemplo6/personas.txt");
        try (var lector = Files.newBufferedReader(ruta)) {
            String linea;

            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error... " + e.getMessage());
        }
    }
}
