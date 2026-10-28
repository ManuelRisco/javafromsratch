package clase_17.Ejemplo8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Path.of("src/clase_17/Ejemplo8/personas.txt");
        try (var escritor = Files.newBufferedWriter(ruta)){
            escritor.write("Ana,21,Sistemas");
            escritor.newLine();

            escritor.write("Fabrizzio,22,Sistemas");
            escritor.newLine();
        }
        try (var lector = Files.newBufferedReader(ruta)){
            String linea;


            while ((linea = lector.readLine()) != null){
                String[] campo = linea.split(",");
                System.out.println("Nombre: " +campo[0]);
                System.out.println("Edad: " + campo[1]);
                System.out.println("Profesion: " + campo[2]);
                System.out.println("---");
            }
        }
    }
}
