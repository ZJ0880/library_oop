package biblioteca;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        libro.setPrestado(true);
    }

   
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void mostrarInfo() {
        System.out.println("Préstamo de: " + libro.getTitulo() + " a " + usuario.getNombre() + " el día " + fechaPrestamo);
    }
}
