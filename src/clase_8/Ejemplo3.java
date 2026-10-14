package clase_8;

public class Ejemplo3 {
    public static void main (String[] args){
        int[][] a = {{1,2,3}
                    ,{4,5,6}
                    ,{7,8,9}};

        mostrar(a);
        invertir(a);
    }

    public static void mostrar(int[][] ejemplo){

        for (int i = 0; i < ejemplo.length; i++) {
            for (int j = 0; j < ejemplo[i].length; j++) {
                System.out.print(ejemplo[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void invertir(int[][] ejemplo){
        for (int i = 0; i < ejemplo.length ; i++) {
            for (int j = i + 1; j < ejemplo[i].length; j++) {
                int temp = ejemplo[i][j];
                ejemplo[i][j] = ejemplo[j][i];
                ejemplo[j][i] = temp;
            }
        }
        mostrar(ejemplo);
    }
}