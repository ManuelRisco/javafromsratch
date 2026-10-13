package clase_7;

public class Ejemplo5 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};



        int valorBuscar = 91;

        int izq = 0;
        int der = numeros.length - 1;

        while (izq <= der){
            int medio = (izq + der) / 2;
            if (numeros[medio] == valorBuscar){
                System.out.println("se encontro en el indice: " + medio);
                return;
            } else
            if (numeros[medio] < valorBuscar) {
                izq = medio + 1;
            } else
            if (numeros[medio] > valorBuscar){
                der = medio - 1;
            }
        }
        System.out.println("No fue encontrado");
    }
}
