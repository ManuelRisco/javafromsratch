package clase_10.Ejemplo2;

import java.math.BigDecimal;

public class TarjetaCredito implements MetodoPago {
    private BigDecimal limiteDisponible;

    public TarjetaCredito(BigDecimal limiteDisponible){
        setLimiteDisponible(limiteDisponible);
    }

    public void setLimiteDisponible(BigDecimal limiteDisponible){
        if (limiteDisponible.compareTo(BigDecimal.ZERO) >= 0){
            this.limiteDisponible = limiteDisponible;
        } else {
            throw new IllegalArgumentException("No se puede poner un saldo negativo wn");
        }
    }
    @Override
    public boolean procesarPago(BigDecimal monto){
        if (((monto.compareTo(BigDecimal.ZERO)) > 0) && ((monto.compareTo(limiteDisponible)) <= 0)){
            limiteDisponible = limiteDisponible.subtract(monto);
            return true;
        }
        return false;
    };
    @Override
    public void mostrarTipo(){
        System.out.println("Metodo de pago: Tarjeta de crédito");
    };

    @Override
    public void getSaldo(){
        System.out.println("limiteDisponible: " + limiteDisponible);
    };
}
