package clase_11.Ejemplo1;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Fabrizzio", "Risco");
        Usuario u1 = new Usuario("Pechero", p1);
        u1.mostrarDatos();
    }
}
