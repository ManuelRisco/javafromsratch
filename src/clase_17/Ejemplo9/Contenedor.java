package clase_17.Ejemplo9;

public class Contenedor<T> {
    private T dato;

    public Contenedor(T dato){
        this.dato = dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public T getDato(){
        return dato;
    }
    public static <T> void imprimir(T dato){
        System.out.println(dato);
    }
}
