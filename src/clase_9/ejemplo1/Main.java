    package clase_9.ejemplo1;


    import java.math.BigDecimal;

    public class Main {
        public static void main(String[] args){
            System.out.println("---MAIN---");
            Programador p = new Programador();

            p.nombre = "Fabrizzio";
            p.sueldo = new BigDecimal(200);

            p.sueldo = p.sueldo.multiply(new BigDecimal(10));
        }
    }
