package ejercicio3;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<PowerInput, Double> powerFunction =
                new Function<PowerInput, Double>() {
                    @Override
                    public Double apply(PowerInput input) {
                        return Math.pow(input.base, input.exponent);
                    }
                };

        Predicate<Double> isEven = x -> x % 2 == 0;

        PowerInput input1 = new PowerInput(2, 3);
        PowerInput input2 = new PowerInput(5, 2);
        PowerInput input3 = new PowerInput(3, 4);

        testPowerFunction(powerFunction, isEven, input1);
        testPowerFunction(powerFunction, isEven, input2);
        testPowerFunction(powerFunction, isEven, input3);
    }

    private static void testPowerFunction(Function<PowerInput, Double> powerFunction, Predicate<Double> isEven, PowerInput input) {
        double result = powerFunction.apply(input);
        System.out.println(input.base + "^" + input.exponent + " = " + result);
        System.out.println("Es par: " + isEven.test(result));
        System.out.println("Es impar: " + !isEven.test(result));
        System.out.println();
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
