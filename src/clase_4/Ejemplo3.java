package clase_4;

public class Ejemplo3 {
    public static void main(String[] args){
        // la primera es llamada por el metodo recibe1 el cual tiene su propia logica, aunque
        // ambos manejen la misma variable internamente no se conocen sus variables entre ellos
        // el metodo recibe2 aunque tenga la misma variable por dentro en distinto porque es otro
        // metodo ademas de que el resultado es diferente porque su logica es diferente
        System.out.println(recibe1(18));
        System.out.println(recibe2(18));
    }

    public static int recibe1(int nota){
        return nota;
    }
    public static int recibe2(int nota){
        return nota + 2;
    }
}
