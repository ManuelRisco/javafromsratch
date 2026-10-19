package clase_10.CajeroAutomatico;

import java.math.BigDecimal;

public class Usuario extends Persona{
    private Persona persona;
    private String nom_user;
    private String clave;
    private BigDecimal saldo;

    public Usuario(){};
    public Usuario(Persona persona, String nom_user, String clave, BigDecimal saldo){
        setPersona(persona);
        setNom_user(nom_user);
        setClave(clave);
        setSaldo(saldo);
    }

    public void setPersona(Persona persona){
        this.persona = persona;
    }
    public void setNom_user(String nom_user){
        if (nom_user.isBlank()){
            throw new IllegalArgumentException("Inserte un dato valido");
        }
        this.nom_user = nom_user.trim();
    }
    public void setClave(String clave){
        if (clave.isBlank()){
            throw new IllegalArgumentException("Error en la clave");
        }
        this.clave = clave;
    }
    public void setSaldo(BigDecimal saldo){
        if ((saldo.compareTo(BigDecimal.ZERO)) >= 0){
            this.saldo = saldo;
        }
        throw new IllegalArgumentException("Ingrese un saldo mayor a cero");
    }
}
