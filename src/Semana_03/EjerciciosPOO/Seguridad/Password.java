package Semana_03.EjerciciosPOO.Seguridad;

import java.lang.reflect.Array;

public class Password {

    private int longitud;
    private String password = "";

    public Password() {
        this.longitud = 10;
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public String generar(){
        int tipo;
        char letra;
        for (int i = 0; i < longitud; i++){

            tipo = (int) Math.floor((Math.random() * 3) + 1);
            switch (tipo){
                case 1:
                    letra = (char) Math.floor((Math.random() * (122 - 97 + 1)) + 97);
                    password += letra;
                    break;
                case 2:
                    letra = (char) Math.floor((Math.random() * (90 - 65 + 1)) + 65);
                    password += letra;
                    break;
                case 3:
                    letra = (char) Math.floor((Math.random() * (57 - 48 + 1)) + 48);
                    password += letra;
                    break;
            }
        }
        return password;
    }

    public void validar(){
        int validacion[] = {0,0,0};
        for (int i = 0; i < longitud; i++){
            if (password.charAt(i) >= (char) 97 && password.charAt(i) <= (char) 122){
                validacion[0]++;
            }
            if (password.charAt(i) >= (char) 65 && password.charAt(i) <= (char) 90){
                validacion[1]++;
            }
            if (password.charAt(i) >= (char) 48 && password.charAt(i) <= (char) 57){
                validacion[2]++;
            }
        }
        if (validacion[0] >= 1 && validacion[1] >= 2 && validacion[2] >= 5){
            System.out.println(password);
            System.out.println("Es segura");
        }else{
            System.out.println(password);
            System.out.println("No es segura");
        }
    }

}
