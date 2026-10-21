package clase_12.Ejemplo5;

public class Main {
    public static void main(String[] args){
        Gimnasio gimnasio = new Gimnasio();

        Socio s1 = new Socio("76949746", "Manuel", "Pierna", 2000);
        Socio s2 = new Socio("67949746", "Benito", "Brazo", 1200);
        Socio s3 = new Socio("06949746", "Anicama", "Pecho", 3200);

        gimnasio.afiliarSocio(s1);
        gimnasio.afiliarSocio(s2);
        gimnasio.afiliarSocio(s3);

        gimnasio.registarIngreso("76949746");
        gimnasio.registarIngreso("67949746");
        gimnasio.registarIngreso("61616196");

        gimnasio.mostrarMetricas();
    }
}
