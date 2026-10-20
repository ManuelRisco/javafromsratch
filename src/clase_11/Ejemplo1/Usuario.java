package clase_11.Ejemplo1;

public class Usuario {
    private String nombreUsuario;
    private Persona persona;

    public Usuario(String nombreUsuario, Persona persona){
        this.nombreUsuario = nombreUsuario;
        this.persona = persona;
    }

    public void mostrarDatos(){
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}
