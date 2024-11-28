package Semana_03.Clase;

public class Vehiculo {

    private String matricula;
    private String modelo;
    private int potencia;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void encenderVehiculo(){
        System.out.println("El vehículo está encendido");
    }

    public void apagarVehiculo(){
        System.out.println("El vehículo está apagado");
    }

}
