package clase_13.Ejemplo1;

import clase_4.Calculadora;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        System.out.println("---Expresiones Lambda---");
        System.out.println("1. Sin parametros (ejecutar una acción)");

        Runnable tarea = () -> System.out.println("Ejecutando hilo...");
        new Thread(tarea).start();

        // Forma más directa
        new Thread(() -> System.out.println("Hilo ejecutado")).start();

        // Usando la interfaz Consumer<T>
        Consumer<String> imprimir = mensaje -> System.out.println(mensaje);
        imprimir.accept("Hola Mundo");

        // Usando una interfaz funcional personalizad o BinaryOperator
        BinaryOperator<Integer> sumar = (a, b) -> a + b;
        int resultado = sumar.apply(10, 20);
        System.out.println(resultado);

        /* Calculadora operar = (a, b) -> {
            int suma = a + b;
            System.out.println("Calculando suma...");
            return suma;
        };
         */

        List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos");
        // Filtrar los nombres que empiezan con "A" y mostrarlos
        nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .forEach(nombre -> System.out.println(nombre));
    }
}
