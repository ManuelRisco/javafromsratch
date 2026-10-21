package clase_12.Ejemplo4;

import java.util.*;

public class PlataformaJuegos {
    private Map<String, Videojuego> catalogo = new HashMap<>();
    private Set<String> generos = new HashSet<>();
    private List<Videojuego> compras = new ArrayList<>();

    public void registrarJuego(Videojuego juego){
        if (catalogo.containsKey(juego.codigo())){
            System.out.println("El juego ya se encuentra registrado en el catalogo");
            return;
        } else {
            catalogo.put(juego.codigo(), juego);
            generos.add(juego.genero());
            System.out.println("El juego se ha registrado con éxito");
        }
    }
    public Videojuego buscarPorCodigo(String codigo){
        return catalogo.get(codigo);
    }
    public void comprarJuego(String codigo){
        Videojuego v = buscarPorCodigo(codigo);
        if (v == null){
            System.out.println("No se encontro el juego");
            return;
        } else {
            compras.add(v);
            System.out.println("El juego fue comprado con éxito: " + v.titulo());
        }
    }
    public void mostrarResumen(){
        System.out.println("---RESUMEN---");
        System.out.println("Juegos disponibles: " + catalogo.size());

        System.out.println("Generos disponibles: " + generos);

        double totalgastado = 0;
        System.out.print("Compras: ");
        for (Videojuego v : compras){
            totalgastado += v.precio();
        }
        System.out.println("Total gastado: " + totalgastado);
    }
}
