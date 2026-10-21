package clase_12.Ejemplo2;

public class Main {
    public static void main(String[] args){
        RespuestaApi<String> respTexto = new RespuestaApi<>(true, "OK", "SESION INICIADA");
        String texto = respTexto.getData();

        RespuestaApi<String> respNumero = new RespuestaApi<>(true, "Contador", "22");
        String num = respNumero.getData();

        System.out.println(texto);
        System.out.println(num);
    }
}
