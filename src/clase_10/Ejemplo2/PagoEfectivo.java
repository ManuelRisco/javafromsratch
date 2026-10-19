package clase_10.Ejemplo2;

import java.math.BigDecimal;

public class PagoEfectivo implements MetodoPago {
    private BigDecimal dineroDisponible;

    public PagoEfectivo(BigDecimal dineroDisponible){
        setDineroDisponible(dineroDisponible);
    }

    @Override
    public boolean procesarPago(BigDecimal monto){
        if (((monto.compareTo(BigDecimal.ZERO)) > 0) && ((monto.compareTo(dineroDisponible)) <= 0)) {
            dineroDisponible = dineroDisponible.subtract(monto);
            return true;
        }
        return false;
    }
    public void setDineroDisponible(BigDecimal dineroDisponible){
        if (dineroDisponible.compareTo(BigDecimal.ZERO) >= 0){
            this.dineroDisponible = dineroDisponible;
        } else {
            throw new IllegalArgumentException("No se puede poner un saldo negativo wn");
        }
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Metodo de pago: Pago en efectivo");
    };

    @Override
    public void getSaldo(){
        System.out.println("dineroDisponible: " + dineroDisponible);
    };
}
