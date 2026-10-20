package clase_11.Ejemplo2;

public class Coche {
    private String marca;
    private Motor motor;

    public Coche(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca(){
        return marca;
    }
    public Motor getMotor(){
        return motor;
    }

    public String mostrarInformacion() {
        return "Coche{" +
                "marca='" + getMarca() + '\'' +
                ", motor=" + motor.getCaballosFuerza() +
                '}';
    }
}
