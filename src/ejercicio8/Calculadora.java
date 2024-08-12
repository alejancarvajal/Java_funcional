package ejercicio8;

public class Calculadora {

    private double acumulado;

    public Calculadora() {
        this.acumulado = 0;
    }

    public Calculadora sumar(double valor) {
        acumulado += valor;
        mostrarAcumulado("sumar", valor);
        return this;
    }

    public Calculadora restar(double valor) {
        acumulado -= valor;
        mostrarAcumulado("restar", valor);
        return this;
    }

    public Calculadora multiplicar(double valor) {
        acumulado *= valor;
        mostrarAcumulado("multiplicar", valor);
        return this;
    }

    public Calculadora dividir(double valor) {
        if (valor == 0) {
            System.out.println("Error: División por cero no permitida.");
        } else {
            acumulado /= valor;
            mostrarAcumulado("dividir", valor);
        }
        return this;
    }

    private void mostrarAcumulado(String operacion, double valor) {
        System.out.printf("Después de %s %f, el acumulado es %f%n", operacion, valor, acumulado);
    }

    public double getAcumulado() {
        return acumulado;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(20)
                .restar(5)
                .multiplicar(3)
                .dividir(2)
                .sumar(10)
                .dividir(0);
        System.out.println("El resultado final es: " + calculadora.getAcumulado());
    }
}