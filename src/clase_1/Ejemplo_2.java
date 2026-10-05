public class Ejemplo_2 {

    public static class Persona{
        String nombre;
        int edad;
    }
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Fabrizzio";
        p1.edad = 22;

        System.out.print(p1.nombre);
        System.out.print(" ");
        System.out.println(p1.edad);
    }
}
