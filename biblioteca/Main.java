package biblioteca;

public class Main {
    public static void main(String[] args) {
    
        Biblioteca biblioteca = new Biblioteca();

        
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "1234567890");
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "0987654321");

      
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

       
        System.out.println("Libros disponibles en la biblioteca:");
        biblioteca.mostrarLibros();

      
        Usuario usuario = new Usuario("Juan Pérez", "U001");

      
        System.out.println("\nPrestando el libro 'Cien Años de Soledad' a Juan Pérez...");
        biblioteca.prestarLibro(libro1, usuario, "2024-09-10");

      
        System.out.println("\nIntentando prestar el libro 'Cien Años de Soledad' nuevamente...");
        biblioteca.prestarLibro(libro1, usuario, "2024-09-11");

        
        System.out.println("\nPréstamos realizados:");
        biblioteca.mostrarPrestamos();

        System.out.println("\nDevolviendo el libro 'Cien Años de Soledad'...");
        biblioteca.devolverLibro(libro1);

        System.out.println("\nLibros disponibles después de la devolución:");
        biblioteca.mostrarLibros();
    }
}
