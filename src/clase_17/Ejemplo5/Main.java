package clase_17.Ejemplo5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            Path ruta = Path.of("src/clase_17/Ejemplo5/personas.txt");

            /* Files.write(ruta, List.of
                    ("Ana,21,Sistemas", "Fabrizzio,22,Sistemas", "Angelus,17,Abogado")
            );
            */

            var lineas = Files.readAllLines(ruta);

            for (String linea : lineas){
                String[] campo = linea.split(",");
                System.out.println("Nombre: " + campo[0]);
                System.out.println("Edad: " + campo[1]);
                int edad = Integer.parseInt(campo[1]);
                verificarEdad(edad);
                System.out.println("---");
            }
        } catch (IOException e){
            System.out.println("Error..." + e.getMessage());
        }
    }

    static void verificarEdad(int edad){
        if (edad <= 0){
            System.out.println("No puede ser negativo o igual cero");
        } else if (edad > 17){
            System.out.println("Mayor");
        } else {
            System.out.println("Menor");
        }
    }
}
