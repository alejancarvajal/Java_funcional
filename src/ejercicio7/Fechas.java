package ejercicio7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Fechas {
    public static void main(String[] args) {
        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2024, 8, 12),
                LocalDate.of(2023, 12, 25),
                LocalDate.of(2022, 1, 1)
        );

        FechaFormatter formatter = new FechaFormatter();

        fechas.forEach(formatter::imprimirFecha);
    }
}

class FechaFormatter {
    void imprimirFecha(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mensaje = "La fecha es " + fecha.format(formatter) + ".";
        System.out.println(mensaje);
    }
}
