package Semana_03.EjerciciosPOO.Libros;

public class Libro {

    private String autor;
    private String titulo;
    private int paginas;

    public Libro() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarLibro(){
        System.out.println("El libro " + titulo + ", del autor " + autor + ", tiene " + paginas + " páginas");
    }

    public String compararLibros(Libro libro1, Libro libro2){
        return libro1.getPaginas() > libro2.getPaginas() ? libro1.getTitulo() +
                " tiene más páginas" : libro2.getTitulo() + " tiene más páginas";
    }

}
