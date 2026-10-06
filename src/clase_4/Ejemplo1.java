package clase_4;

public class Ejemplo1 {
    public static void main(String[] args){
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){
        for (int i = 1; i <=5; i++){
            System.out.println(i*2);
        }
    }
    public static void ejercicio2(){
        for (int i = 1; i <= 6; i++){
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void ejercicio3(){
        int suma = 0;
        for (int i = 1; i <= 4; i++){
            suma++;
        }
        System.out.println("Vueltas: " + suma);
    }

}
