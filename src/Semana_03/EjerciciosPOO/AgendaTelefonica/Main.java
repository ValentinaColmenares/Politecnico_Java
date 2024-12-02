package Semana_03.EjerciciosPOO.AgendaTelefonica;

public class Main {
    public static void main(String[] args) {

        Contacto vanessa = new Contacto("Laura", "3158239403");
        Contacto rogelio = new Contacto("Rogelio", "3226482930");
        Contacto quintina = new Contacto("Quintina", "3137394059");

        Agenda libreta = new Agenda();

        libreta.disponibles();
        libreta.registrarContacto(vanessa);
        libreta.registrarContacto(rogelio);
        libreta.registrarContacto(quintina);
        libreta.listarContactos();
        libreta.buscarContacto("Rogelio");
        libreta.disponibles();

    }
}
