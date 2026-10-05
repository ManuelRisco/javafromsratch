public class Calculadora {
    public static double pi(){
        return 3.14159;
    }
    public double sumar(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println("Diferencia de Static e Instancia");
        System.out.println("STATIC sirve para que se en toda la clase el metodo se comparta y no se tenga que inicializar el objeto");
        System.out.println(pi());
        Calculadora c1 = new Calculadora();
        System.out.println("INSTANCIA sirve para que se instancie por cada objeto que uno crea");
        System.out.println(c1.sumar(1,2));

    }
}
