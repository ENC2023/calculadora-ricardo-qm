package miPrincipal;

/**
 * Esta clase representa una calculadora que realiza operaciones matemáticas básicas.
 */
public class Calculadora {

    /**
     * Realiza la operación de suma entre dos números.
     * @param x El primer número.
     * @param y El segundo número.
     * @return El resultado de la suma.
     */
    public double suma(double x, double y) {
        return x + y;
    }
    
    /**
     * Realiza la operación de resta entre dos números.
     * @param x El primer número.
     * @param y El segundo número.
     * @return El resultado de la resta.
     */
    public double resta(double x, double y) {
        return x - y;
    }

    /**
     * Realiza la operación de multiplicación entre dos números.
     * @param x El primer número.
     * @param y El segundo número.
     * @return El resultado de la multiplicación.
     */
    public double multiplica(double x, double y) {
        return x * y;
    }

    /**
     * Realiza la operación de división entre dos números.
     * @param x El dividendo.
     * @param y El divisor.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
    }
}
