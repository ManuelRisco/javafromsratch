package clase_10.Ejemplo2;

import java.math.BigDecimal;

public interface MetodoPago {

    public boolean procesarPago(BigDecimal monto);
    public void mostrarTipo();
    public void getSaldo();
}
