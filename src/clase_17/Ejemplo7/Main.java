package clase_17.Ejemplo7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo7/personas.txt");
        try (var escritor = Files.newBufferedWriter(ruta)){
            escritor.write("Ana,21,Sistemas");
            escritor.newLine();
            escritor.write("Pedro,25,Desarrollo");
            escritor.newLine();

        }
        try (var lector = Files.newBufferedReader(ruta)){
            String linea;

            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }
    }
}
