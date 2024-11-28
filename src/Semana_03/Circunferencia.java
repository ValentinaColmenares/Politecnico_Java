package Semana_03;

public class Circunferencia {

    static float pi = 3.1415926535f;
    private float radio = 0f;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float area(){
        return pi * (radio * radio);
    }

    public static float area(float radio){
        return pi * (radio * radio);
    }


}
