package clase_10.Ejemplo2;

import java.math.BigDecimal;

public class BilleteraDigital implements MetodoPago {
    private BigDecimal saldo;

    public BilleteraDigital(BigDecimal saldo){
        setSaldo(saldo);
    }

    public void setSaldo(BigDecimal saldo){
        if (saldo.compareTo(BigDecimal.ZERO) >= 0){
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("No se puede poner un saldo negativo wn");
        }
    }

    @Override
    public boolean procesarPago(BigDecimal monto) {
        if (((monto.compareTo(BigDecimal.ZERO)) > 0) && ((monto.compareTo(saldo)) <= 0)) {
            saldo = saldo.subtract(monto);
            return true;
        }
        return false;
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Metodo de pago: Billetera Digital");
    };

    @Override
    public void getSaldo(){
        System.out.println("saldo: " + saldo);
    };
}
