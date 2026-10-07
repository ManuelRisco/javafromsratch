package clase_4;

public class DemoProducto {
    public static void main(String[] args){
        Producto pro1 = new Producto("Caja", 10);
        Producto pro2 = new Producto("Bolsa", 6);

        boolean realizado = pro1.retirar(3);
        System.out.println("---retirar---");
        System.out.println(realizado);
        System.out.println(pro1.getStock());
        System.out.println("---ingresar---");
        realizado = pro1.ingresar(10);
        System.out.println(realizado);
        System.out.println(pro1.getStock());
    }
}
