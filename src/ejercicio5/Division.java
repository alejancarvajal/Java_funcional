package ejercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Division {

    public static void main(String[] args) {
        BinaryOperator<BigDecimal> dividir = (a, b) -> {
            if (b.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }
            return a.divide(b, 10, RoundingMode.HALF_UP);
        };

        BigDecimal numero1 = new BigDecimal("20.0");
        BigDecimal numero2 = new BigDecimal("6.0");
        BigDecimal numero3 = new BigDecimal("100.0");
        BigDecimal numero4 = new BigDecimal("3.0");
        BigDecimal numero5 = new BigDecimal("7.0");
        BigDecimal numero6 = new BigDecimal("22.0");

        BigDecimal resultado1 = dividir.apply(numero1, numero2);
        BigDecimal resultado2 = dividir.apply(numero3, numero4);
        BigDecimal resultado3 = dividir.apply(numero5, numero6);

        System.out.println("Resultado de 20 / 6: " + resultado1);
        System.out.println("Resultado de 100 / 3: " + resultado2);
        System.out.println("Resultado de 7 / 22: " + resultado3);
    }
}