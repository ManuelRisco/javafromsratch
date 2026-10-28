package clase_17.Ejemplo9;

public class Utilidades <T>{
    private T dato;

    public Utilidades(T dato){
        this.dato = dato;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    public T getDato(){
        return dato;
    }
    public static <T> void mostrarDato(T dato){
        System.out.println(dato);
    }
    public static <T> boolean compararDatos(T dato1, T dato2){
        return dato1.equals(dato2);
    }
    public static <T extends Number> double convertirDouble(T dato1){
        return dato1.doubleValue();
    }
    public static <T extends Number> double obtenerMayor(T dato1, T dato2){
        return Math.max(dato1.doubleValue(), dato2.doubleValue());
    }
    public static <T> boolean sonIguales(T dato1, T dato2){
        return dato1.equals(dato2);
    }
}
