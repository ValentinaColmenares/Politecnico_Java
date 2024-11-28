package Semana_03;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }
}
