package Semana_03.EjerciciosClasesAtributosConstructores.EjercicioCiudad;

public class Main {
    public static void main(String[] args) {

        Ciudad bogota = new Ciudad();

        bogota.setNombre("Bogotá");
        bogota.setPoblacion(7907000);
        bogota.setPais("Colombia");
        bogota.setPresidente("Gustavo Petro");

        System.out.println("Ciudad: " + bogota.getNombre());
        System.out.println("País: " + bogota.getPoblacion());
        System.out.println("Población: " + bogota.getPais());
        System.out.println("Presidente: " + bogota.getPresidente());

    }
}
