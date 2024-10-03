package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(Libro libro, Usuario usuario, String fechaPrestamo) {
        if (!libro.isPrestado()) {
            Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo);
            prestamos.add(prestamo);
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolverLibro(Libro libro) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro)) {
                libro.setPrestado(false);
                prestamos.remove(prestamo);
                System.out.println("Libro devuelto con éxito.");
                return;
            }
        }
        System.out.println("El libro no está en préstamo.");
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInfo();
        }
    }
}
