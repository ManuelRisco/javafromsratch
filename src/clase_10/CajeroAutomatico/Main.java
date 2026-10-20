package clase_10.CajeroAutomatico;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // INICIALIZAR LISTAS
        List<Persona> personas = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();

        Persona p1 = new Persona("Fabrizzio", "Risco", "Gil", 18);
        Persona p2 = new Persona("christofer", "Tapia", "Peralta", 129);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        personas.add(p1);
        personas.add(p2);

        Usuario u1 = new Usuario(p1, "pechero", "123456", new BigDecimal("1200"));
        Usuario u2 = new Usuario(p2, "benito", "456789", new BigDecimal("600"));
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        usuarios.add(u1);
        usuarios.add(u2);

        Distrito[] distritos = {new Distrito("Chorrillos"),
                                new Distrito("Surco"),
                                new Distrito("Los Olivos"),
                                new Distrito("Villa Maria del Triunfo"),
                                new Distrito("Villa el Salvador")};

        System.out.println(Arrays.toString(distritos));

        Cajero c1 = new Cajero(new BigDecimal("1200000"), usuarios, distritos[0]);
        System.out.println(c1);

        System.out.println(u1.getSaldo());
        c1.sacarDinero(u1, new BigDecimal("-1200"));
        System.out.println(u1.getSaldo());

    }
}
