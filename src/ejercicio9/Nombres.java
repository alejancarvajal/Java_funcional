package ejercicio9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Nombres {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Pedro", 22),
                new Persona("Carlos", 40),
                new Persona("Ana", 33)
        );

        int edadMinima = 30;
        List<Persona> personasFiltradas = filtrarPersonasPorEdad(personas, edadMinima);

        imprimirPersonasFiltradas(Optional.of(personasFiltradas));
    }

    public static List<Persona> filtrarPersonasPorEdad(List<Persona> personas, int edadMinima) {
        return personas.stream()
                .filter(persona -> persona.getEdad() >= edadMinima)
                .collect(Collectors.toList());
    }

    public static void imprimirPersonasFiltradas(Optional<List<Persona>> personasFiltradas) {
        personasFiltradas.ifPresent(lista -> {
            if (lista.isEmpty()) {
                System.out.println("No se encontraron personas con la edad mínima especificada.");
            } else {
                lista.forEach(persona -> System.out.println("Persona encontrada: " + persona.getNombre()));
            }
        });
    }

    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}
