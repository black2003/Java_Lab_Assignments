package part2;
import java.math.BigInteger;

public class knl {
    public static void main(String[] args) {
        try {
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                validateInput(num);
                BigInteger factorial = calculateFactorial(num);
                System.out.println("Factorial of " + num + " = " + factorial);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (FactorialException e) {
            System.err.println(e);
        }
    }

    private static void validateInput(int num) throws FactorialException {
        if (num < 0 || num > 15) {
            throw new FactorialException(num);
        }
    }

    private static BigInteger calculateFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

class FactorialException extends Exception {
    private final int invalidNumber;

    public FactorialException(int invalidNumber) {
        super("Factorial is not defined for the value: " + invalidNumber);
        this.invalidNumber = invalidNumber;
    }

    @Override
    public String toString() {
        return "FactorialException: " + getMessage();
    }
}
