package clase_10.Ejemplo2;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<MetodoPago> mp = new ArrayList<>();
        mp.add(new TarjetaCredito(new BigDecimal("200")));
        mp.add(new BilleteraDigital(new BigDecimal("300")));
        mp.add(new PagoEfectivo(new BigDecimal("100")));

        for (MetodoPago metodoPagos : mp){
            metodoPagos.mostrarTipo();
            System.out.println(metodoPagos.procesarPago(new BigDecimal("300")));
            metodoPagos.getSaldo();
        }
    }
}
