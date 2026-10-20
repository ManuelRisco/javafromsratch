package clase_10.CajeroAutomatico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cajero {
    private BigDecimal saldoCajero;
    private List<Usuario> usuarios;
    private Distrito distrito;

    public Cajero(BigDecimal saldoCajero, List<Usuario> usuarios, Distrito distrito){
        setSaldoCajero(saldoCajero);
        setUsuarios(usuarios);
        setDistrito(distrito);
    }

    public void setSaldoCajero(BigDecimal saldoCajero){
        if ((saldoCajero.compareTo(BigDecimal.ZERO)) >= 0){
            this.saldoCajero = saldoCajero;
        } else {
            throw new IllegalArgumentException("Ingrese un saldo mayor a cero");
        }
    }
    public void setUsuarios(List<Usuario> usuarios){
        if (usuarios == null){
            throw new IllegalArgumentException("El objeto está vacio");
        } else {
            this.usuarios = usuarios;
        }
    }
    public void setDistrito(Distrito distrito){
        if (distrito == null){
            throw new IllegalArgumentException("El objeto es nulo");
        }
        else {
            this.distrito = distrito;
        }
    }

    public void sacarDinero(Usuario usuario, BigDecimal monto){
        if (this.saldoCajero.compareTo(monto) >= 0 && usuario.getSaldo().compareTo(BigDecimal.ZERO) > 0 && monto.compareTo(usuario.getSaldo()) <= 0 && monto.compareTo(BigDecimal.ZERO) > 0){
            setSaldoCajero(this.saldoCajero.subtract(monto));
            usuario.setSaldoUsuario(usuario.getSaldo().subtract(monto));
        } else {
            throw new IllegalArgumentException("Error al sacar dinero");
        }
    }

    @Override
    public String toString() {
        return "\nCajero{" +
                "saldoCajero=" + saldoCajero +
                ", usuarios=" + usuarios +
                ", distrito=" + distrito +
                '}';
    }
}
