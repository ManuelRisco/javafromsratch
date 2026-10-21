package clase_12.Ejemplo2;

public class RespuestaApi<T extends String> {
    private boolean exito;
    private String mensaje;
    private T data;  // tomará el tipo que yo decida al instanciarlo

    public RespuestaApi(boolean exito, String mensaje, T data){
        this.exito = exito;
        this.mensaje = mensaje;
        this.data = data;
    }

    public boolean isExito(){
        return exito;
    }
    public String getMensaje(){
        return mensaje;
    }
    public T getData(){
        return data;
    }
}
