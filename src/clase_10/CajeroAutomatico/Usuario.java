package clase_10.CajeroAutomatico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static final List<Usuario> REGISTRO_GLOBAL = new ArrayList<>();
    private Persona persona;
    private String nom_user;
    private String clave;
    private BigDecimal saldoUsuario;

    public Usuario(Persona persona, String nom_user, String clave, BigDecimal saldoUsuario){
        setPersona(persona);
        setNom_user(nom_user);
        setClave(clave);
        setSaldoUsuario(saldoUsuario);
        REGISTRO_GLOBAL.add(this);
    }

    public void setPersona(Persona persona){
        if (persona == null){
            throw new IllegalArgumentException("El objeto está vacio");
        }
        this.persona = persona;
    }
    public void setNom_user(String nom_user) {
        if (nom_user.isBlank()) {
            throw new IllegalArgumentException("Inserte un dato valido");
        }
        String nombreLimpio = nom_user.trim();

        for (Usuario u : REGISTRO_GLOBAL) {
            if (u != this && u.getNom_user().equalsIgnoreCase(nombreLimpio)) {
                throw new IllegalArgumentException("No se aceptan duplicados");
            }
        }

        this.nom_user = nombreLimpio;
    }
    public void setClave(String clave){
        if (clave.isBlank()){
            throw new IllegalArgumentException("Error en la clave");
        }
        this.clave = clave;
    }
    public void setSaldoUsuario(BigDecimal saldoUsuario){
        if ((saldoUsuario.compareTo(BigDecimal.ZERO)) >= 0){
            this.saldoUsuario = saldoUsuario;
        }
        else {
            throw new IllegalArgumentException("Ingrese un saldo mayor a cero");
        }
    }

    public BigDecimal getSaldo(){
        return saldoUsuario;
    }
    public String getNom_user(){
        return nom_user;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "persona=" + persona +
                ", nom_user='" + nom_user + '\'' +
                ", saldoUsuario=" + saldoUsuario +
                '}';
    }
}
