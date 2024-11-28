package Semana_03;

public class BarcoPirata implements Barco{

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void conocerPosicion(){
        System.out.println("La posición actual es: " + x + " - " + y);
    }

    @Override
    public void moverPosicion(int x, int y){
        this.x -= x;
        this.y -= y;
    }

    @Override
    public void disparar(){
        System.out.println("Disparar cañones");
    }

}
