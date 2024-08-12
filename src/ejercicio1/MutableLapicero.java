package ejercicio1;

import java.util.List;

public class MutableLapicero {

    private String color;
    private String tipo;
    private List<String> caracteristicas;

    public MutableLapicero() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "MutableLapicero{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}