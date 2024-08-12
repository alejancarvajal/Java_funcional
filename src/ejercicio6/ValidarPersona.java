package ejercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ValidarPersona {

    @FunctionalInterface
    interface Persona {
        String validar(String nombre, int edad, String fechaNacimiento);
    }

    public static void main(String[] args) {
        Persona persona = (nombre, edad, fechaNacimiento) -> {
            int edadCalculada = calcularEdad(fechaNacimiento);
            return generarMensaje(nombre, edad, edadCalculada);
        };

        String nombre = "Alejandra";
        int edad = 30;
        String fechaNacimiento = "1993-08-15";

        String resultado = persona.validar(nombre, edad, fechaNacimiento);
        System.out.println(resultado);
    }

    private static int calcularEdad(String fechaNacimiento) {
        LocalDate fechaNacimientoLocalDate = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate ahora = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(fechaNacimientoLocalDate, ahora);
    }

    private static String generarMensaje(String nombre, int edad, int edadCalculada) {
        if (edadCalculada == edad) {
            return "La fecha de nacimiento de " + nombre + " corresponde a la edad ingresada.";
        } else {
            return "La fecha de nacimiento de " + nombre + " no corresponde a la edad ingresada.";
        }
    }
}
