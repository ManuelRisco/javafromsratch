package clase_11.Ejemplo2;


public class Main {
    public static void main(String[] args){
        Motor m1 = new Motor(100);
        Coche c1 = new Coche("Toyota", m1);
        m1.mostarMotor();
        System.out.println(c1.mostrarInformacion());
        m1.cambiarMotor(300);
        System.out.println(m1.getCaballosFuerza());
    }
}
