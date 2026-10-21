package clase_12.Ejemplo1;

public class Main {
    // equals y hashCode
    public static void main(String[] args){
        Coche c1 = new Coche("Toyota", 2004);
        Coche c2 = new Coche("Toyota", 2004);

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}
