package clase_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ejemplo2_1 {
    public record LineaPedido(String codigo, int cantidad) {
        public LineaPedido {
            if (cantidad <= 0) {
                throw new IllegalArgumentException("Cantidad inválida");
            }
        }
    }

    // En Pedido.java:
    public class Pedido {
        private final List<LineaPedido> lineas = new ArrayList<>();

        public void agregar(LineaPedido linea) {
            lineas.add(Objects.requireNonNull(linea));
        }

        public List<LineaPedido> getLineas() {
            return List.copyOf(lineas);
        }
    }
}
