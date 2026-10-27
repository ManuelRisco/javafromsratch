package clase_16.Ejemplo1;

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay datos");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == dato) {
                System.out.println("Se encontro su numero");
                return true;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontro su numero");
        return false;
    }
    public void eliminar(int dato) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.valor == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        Nodo anterior = null;
        while (actual != null && actual.valor != dato) {
            anterior = actual;
            actual = actual.siguiente;
        }
        if (actual != null) {
            anterior.siguiente = actual.siguiente;
        }
    }
    public void insertarEnPosicion(int dato, int posicion){
        if (posicion < 0){
            return;
        }
        Nodo nuevo = new Nodo(dato);

        if (posicion == 0){
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        int contador = 0;

        while (actual != null && contador < posicion -1){
            actual = actual.siguiente;
            contador++;
        }
        if (actual == null){
            return;
        }
        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
    }
}
