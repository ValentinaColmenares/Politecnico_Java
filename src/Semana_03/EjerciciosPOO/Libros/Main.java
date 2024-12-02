package Semana_03.EjerciciosPOO.Libros;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Marqiez");
        libro1.setPaginas(482);

        libro2.setTitulo("El psicoanalista");
        libro2.setAutor("John Katzenbach");
        libro2.setPaginas(524);

        libro1.mostrarLibro();
        libro2.mostrarLibro();

        System.out.println(libro1.compararLibros(libro1,libro2));

    }
}
