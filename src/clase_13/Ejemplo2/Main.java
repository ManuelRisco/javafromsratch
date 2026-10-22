package clase_13.Ejemplo2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        Runnable guardarlambda = () -> System.out.println("Hola mundo");
        guardarlambda.run();

        Consumer<String> saludo1 = nombre -> System.out.println("Hola " + nombre);
        saludo1.accept("Manuel");

        BiFunction<Integer, Integer, Integer> sumar1 = (a, b) -> a + b;
        BinaryOperator<Integer> sumar2 = (a, b) -> a + b;

        int resultado1 = sumar1.apply(10, 20);
        int resultado2= sumar2.apply(20, 30);

        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
