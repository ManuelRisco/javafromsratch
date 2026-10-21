package clase_12.Ejemplo4;

public class Main {
    public static void main(String[] args){
        PlataformaJuegos p1 = new PlataformaJuegos();

        Videojuego v1 = new Videojuego("001", "Left", 200, "Accion");
        Videojuego v2 = new Videojuego("002", "Minecraft", 300, "Aventura");
        Videojuego v3 = new Videojuego("003", "Fortnite", 400, "Disparos");

        p1.registrarJuego(v1);
        p1.registrarJuego(v2);
        p1.registrarJuego(v3);

        p1.buscarPorCodigo("001");
        p1.buscarPorCodigo("002");
        p1.buscarPorCodigo("003");
        p1.buscarPorCodigo("009");

        p1.comprarJuego("001");
        p1.comprarJuego("002");
        p1.comprarJuego("001");
        p1.comprarJuego("009");

        p1.buscarPorCodigo("001");
        p1.buscarPorCodigo("002");
        p1.buscarPorCodigo("009");

        p1.mostrarResumen();
    }
}
