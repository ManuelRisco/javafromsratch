package clase_13.Ejemplo3;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        List<String> nombres = List.of("Manuel",
                                        "Benito",
                                        "Anicama");

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("CON LAMBDA");

        nombres.forEach(nombre -> System.out.println(nombre));

        Predicate<Integer> esmayor = edad -> edad >= 18;
        System.out.println(esmayor.test(19));

    }
}
