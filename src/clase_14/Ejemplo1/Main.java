package clase_14.Ejemplo1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Tipos de lambdas---");

        System.out.println("Runnable | Sin parametros");
        Runnable tarea = () -> System.out.println("Tarea creada");
        tarea.run();

        System.out.println("Consumer | con un parametro");
        Consumer<String> despedida = s -> System.out.println("Adios " + s);
        despedida.accept("Manuel");

        System.out.println("BiFunction | dos parametros y devolver un valor | se tienen que especificar los 3 tipos de datos (2 parametros y 1 valor devuelto");
        BiFunction<Double, Double, Double> multiplicacion = (a, b) -> a * b;
        double resultado1 = multiplicacion.apply(10.1, 20.2);
        System.out.printf("%.3f", resultado1);
        System.out.println();

        System.out.println("BinaryOperator | dos parametros y devolver un valor | solo se especifica un solo tipo de dato");
        BinaryOperator<Double> division = (a, b) -> a / b;
        double resultado2 = division.apply(20.0, 5.0);
        System.out.printf("%.3f", resultado2);
        System.out.println();

        System.out.println("Formateo de numero BigDecimal");
        BigDecimal numeroFinanciero = new BigDecimal("12.345602");
        numeroFinanciero = numeroFinanciero.setScale(3, RoundingMode.HALF_UP);
        System.out.println(numeroFinanciero.doubleValue());

        System.out.println("Lambdas con colecciones | si se tiene una lista de datos se puede utilizar");
        List<String> lista = List.of("Manuel", "Piero", "Jarod", "Benito", "Anicama");
        List<String> listaFiltrada = lista.stream()
                .filter(s -> s.length() > 5)
                .map(s -> s + " | filtrado |")
                .toList();
        System.out.println(listaFiltrada);

        Predicate<String> listaFiltradaPredicate = s -> s.length() > 5;
        List<String> listaFiltradaDevuelta = lista.stream()
                .filter(listaFiltradaPredicate)
                .toList();
        System.out.println(listaFiltradaDevuelta);
    }
}