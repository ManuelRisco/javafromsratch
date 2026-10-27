package clase_16.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada l1 = new ListaEnlazada();

        l1.insertar(20);
        l1.insertar(30);
        l1.insertar(40);

        l1.mostrar();
        l1.insertarEnPosicion(1,0);
        System.out.println("Insertar");
        l1.mostrar();
    }
}
