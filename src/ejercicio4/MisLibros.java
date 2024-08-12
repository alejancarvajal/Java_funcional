package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MisLibros {

    public static void main(String[] args) {
        Supplier<List<Libro>> libroSupplier = MisLibros::crearListaLibros;
        List<Libro> listaLibros = libroSupplier.get();
        Consumer<List<Libro>> libroConsumer = MisLibros::procesarLibros;
        libroConsumer.accept(listaLibros);
    }

    private static List<Libro> crearListaLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("El Quijote", "Miguel de Cervantes", 9));
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10));
        libros.add(new Libro("Donde los Árboles Cantan", "Laura Gallego", 8));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 7));
        libros.add(new Libro("El Hobbit", "J.R.R. Tolkien", 6));
        return libros;
    }

    private static void procesarLibros(List<Libro> libros) {
        Predicate<Libro> esRecomendado = libro -> libro.getPuntaje() >= 7;
        UnaryOperator<Libro> mostrarMensaje = libro -> {
            if (esRecomendado.test(libro)) {
                System.out.println("El libro \"" + libro.getNombre() + "\" es recomendado.");
            }
            return libro;
        };

        libros.forEach(mostrarMensaje::apply);
    }

    static class Libro {
        private String nombre;
        private String autor;
        private int puntaje;

        public Libro(String nombre, String autor, int puntaje) {
            this.nombre = nombre;
            this.autor = autor;
            this.puntaje = puntaje;
        }

        public String getNombre() {
            return nombre;
        }

        public String getAutor() {
            return autor;
        }

        public int getPuntaje() {
            return puntaje;
        }

        @Override
        public String toString() {
            return "Libro{" +
                    "nombre='" + nombre + '\'' +
                    ", autor='" + autor + '\'' +
                    ", puntaje=" + puntaje +
                    '}';
        }
    }
}