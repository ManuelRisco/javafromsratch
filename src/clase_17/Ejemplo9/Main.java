package clase_17.Ejemplo9;

import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {
        Contenedor<String> guardado1 = new Contenedor<>("Java");
        Contenedor<Integer> guardado2 = new Contenedor<>(21);

        System.out.println(guardado1.getDato());
        System.out.println(guardado2.getDato());

        Utilidades.mostrarDato("Python");
        Utilidades.mostrarDato(20);

        System.out.println(Utilidades.compararDatos("Python", "Paa"));
        System.out.println(Utilidades.compararDatos("Java", "Java"));
        System.out.println(Utilidades.compararDatos(10, 20));

        System.out.println(Utilidades.obtenerMayor(10,20));
        System.out.println(Utilidades.sonIguales("0",0));
    }
}
