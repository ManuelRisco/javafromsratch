package clase_3;

public class Reto2 {
    public static void main(String[] args){
        System.out.println("SISTEMA DE TICKETS");
        boolean estado = true;
        boolean acceso = false;
        boolean esAdmin = false;

        if (esAdmin == true) {
            System.out.println("Eres admin, ticket terminado");
        }else if (estado == true && acceso == true) {
            System.out.println("Ticket cerrado");
        } else {
            System.out.println("Ticket abierto");
        }
    }
}
