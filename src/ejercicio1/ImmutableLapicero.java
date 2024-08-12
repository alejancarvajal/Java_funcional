package ejercicio1;
import java.util.Collections;

import java.util.List;

public final class ImmutableLapicero {

    private final String color;
    private final String tipo;
    private final List<String> caracteristicas;

    public ImmutableLapicero(String color, String tipo, List<String> caracteristicas) {
        this.color = color;
        this.tipo = tipo;
        this.caracteristicas = caracteristicas == null ? Collections.emptyList() : Collections.unmodifiableList(caracteristicas);
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public List<String> getCaracteristicas() {
        return caracteristicas;
    }

    @Override
    public String toString() {
        return "ImmutableLapicero{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
