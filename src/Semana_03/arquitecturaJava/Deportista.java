package Semana_03.arquitecturaJava;

public class Deportista extends Persona{

    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String nombre) {
        super(nombre);  // Con super()

    }

    public Deportista(String nombre, String deporte) {
        // super(nombre);           //con super() SON EXCLUYENTES
        this(nombre);               //con this() SON EXCLUYENTES
        this.deporte = deporte;
    }

}
