package Semana_03;

public class Calculadora {

    private int numero1;
    private String operador;
    private int numero2;

    public Calculadora() {

    }

    public Calculadora(int numero1, String operador, int numero2) {
        this.numero1 = numero1;
        this.operador = operador;
        this.numero2 = numero2;
    }

    // Getters y setters

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String operacion(){
        return this.getNumero1() + " " + this.getOperador() + " " + this.getNumero2();
    }

    public int sumar(int numero1, int numero2){
        return numero1+numero2;
    }

    public double sumar(double numero1, double numero2){
        return numero1+numero2;
    }

    public float sumar(float numero1, float numero2){
        return numero1+numero2;
    }

    public int sumar(){
        return 0;
    }

    public int sumar(int numero1, int numero2, int numero3){
        return numero1+numero2+numero3;
    }

    public int sumarVector(int numeros[]){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }

}
