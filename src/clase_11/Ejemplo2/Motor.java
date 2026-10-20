package clase_11.Ejemplo2;

public class Motor {
    private int caballosFuerza;
    public Motor(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public int getCaballosFuerza(){
        return caballosFuerza;
    }

    public void mostarMotor(){
        System.out.println("Fuerza: " + getCaballosFuerza());
    }
}
