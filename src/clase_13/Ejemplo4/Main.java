package clase_13.Ejemplo4;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numeros = List.of(7,8,0,4,9);

        List<Integer> esMayor = numeros.stream()
                .filter(numero -> numero > 8)
                .toList();
        System.out.println(esMayor);

        List<Integer> ordenado = numeros.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println(ordenado);
    }
}
