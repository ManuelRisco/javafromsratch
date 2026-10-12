package clase_6;

public class Ejemplo1 {
    private String nombre;
    private String codigo;


    public Ejemplo1 (String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public Ejemplo1 (String codigo){
        this(codigo,"0");
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public static void main(String[] args){
        Ejemplo1 ej1 = new Ejemplo1("nombre 1","codigo 1");
        Ejemplo1 ej2 = new Ejemplo1("2");
        System.out.println(ej1.getNombre());
        System.out.println(ej1.getCodigo());
        System.out.println("----------------");
        System.out.println(ej2.getCodigo());
    }
}
