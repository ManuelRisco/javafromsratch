package clase_12.Ejemplo5;

import java.util.*;

public class Gimnasio {
    private Map<String, Socio> padronSocios = new HashMap<>();
    private Set<String> disciplinas = new HashSet<>();
    private List<String> registroAsistencias = new ArrayList<>();

    public void afiliarSocio(Socio socio) {
        if (padronSocios.containsKey(socio.dni())) {
            System.out.println("Error - Ya es socio");
            return;
        } else {
            padronSocios.put(socio.dni(), socio);
            disciplinas.add(socio.disciplina());
            System.out.println("Registrado con exito");
        }
    }
    public Socio buscarSocio(String dni){
        return padronSocios.get(dni);
    }
    public void registarIngreso(String dni){
        Socio s = buscarSocio(dni);
        if (s == null){
            System.out.println("Acceso denegado: Socio no registrado");
            return;
        } else {
            System.out.println("Ingreso registrado, bienvenido: " + s.nombre() + " " + s.disciplina());
            registroAsistencias.add(dni);
        }
    }
    public void mostrarMetricas(){
        System.out.println("---METRICAS---");
        System.out.println("Disciplinas: " + disciplinas);

        System.out.println("Registro total de asistencias: " + registroAsistencias.size());

        double mensualProyectado = 0;
        for (Socio s : padronSocios.values()){
            mensualProyectado += s.cuotaMensual();
        }
        System.out.println("Mensual proyectado: " + mensualProyectado);
        System.out.println("---------------------------\n");
    }
}

