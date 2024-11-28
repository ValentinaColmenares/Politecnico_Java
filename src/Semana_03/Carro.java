package Semana_03;

public class Carro {

    private String marca;
    private String modelo;
    private String color;
    private boolean enVenta;

    public Carro() {

    }

    public Carro(String marca, String modelo, String color, boolean enVenta){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.enVenta = enVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }
}
