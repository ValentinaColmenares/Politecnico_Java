package Semana_03.EjerciciosPOO.AgendaTelefonica;

public class Agenda {

    private Contacto contactos[] = new Contacto[10];
    private int registros = 0;

    public Agenda() {

    }

    public void registrarContacto(Contacto nuevoContacto){
        contactos[registros] = nuevoContacto;
        registros++;
    }

    public void listarContactos(){
        for (int i = 1; i <= registros; i++){
            System.out.println(i + ". Nombre: " + contactos[i-1].getNombre() + " - Número: " + contactos[i-1].getNumero());
        }
    }

    public void buscarContacto(String nombre){
        for (int i = 0; i < registros; i++){
            if (contactos[i].getNombre().equals(nombre)){
                System.out.println("El teléfono de " + nombre + " es: " + contactos[i].getNumero());
            }
        }
    }

    public void disponibles(){
        int disponibles = 10 - registros;
        System.out.println("Hay " + disponibles + " contactos disponibles para registrar.");
    }

}
