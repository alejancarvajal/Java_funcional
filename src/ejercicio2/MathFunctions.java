package ejercicio2;

import java.util.function.Function;

public class MathFunctions {
    public static void main(String[] args) {
        Function<PowerInput, Double> powerFunction =
                new Function<PowerInput, Double>() {
                    @Override
                    public Double apply(PowerInput input) {
                        return Math.pow(input.base, input.exponent);
                    }
                };

        PowerInput input1 = new PowerInput(2, 3);
        PowerInput input2 = new PowerInput(5, 2);
        PowerInput input3 = new PowerInput(3, 4);

        System.out.println("2^3 = " + powerFunction.apply(input1));
        System.out.println("5^2 = " + powerFunction.apply(input2));
        System.out.println("3^4 = " + powerFunction.apply(input3));
    }

    static class PowerInput {
        int base;
        int exponent;

        public PowerInput(int base, int exponent) {
            this.base = base;
            this.exponent = exponent;
        }
    }
}