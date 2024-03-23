package part1;

public class RationalCalculator {
    public static void main( String[] args ) {
        try {
            Rational num1 = parseRational(args[0]);
            Rational num2 = parseRational(args[1]);

            System.out.println("First rational number: " + num1);
            System.out.println("Second rational number: " + num2);
            System.out.println("Sum: " + num1.add(num2));
            System.out.println("Difference: " + num1.subtract(num2));
            System.out.println("Product: " + num1.multiply(num2));
            System.out.println("Quotient: " + num1.divide(num2));
            System.out.println("Comparison result: " + compare(num1, num2));
            System.out.println("Absolute value of first number: " + num1.abs());
            System.out.println("Absolute value of second number: " + num2.abs());
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Invalid input. Please provide two rational numbers in the format a/b.");
        }
    }

    private static Rational parseRational(String input) {
        String[] parts = input.split("/");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid format. Must be in the form a/b.");
        }
        int numerator = Integer.parseInt(parts[0]);
        int denominator = Integer.parseInt(parts[1]);
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return new Rational(numerator, denominator);
    }

    private static String compare(Rational num1, Rational num2) {
        double diff = num1.toDouble() - num2.toDouble();
        if (diff < 0) {
            return "First number is less than second number";
        } else if (diff > 0) {
            return "First number is greater than second number";
        } else {
            return "Both numbers are equal";
        }
    }
}

class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Rational add(Rational other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Rational(newNumerator, commonDenominator);
    }

    public Rational subtract(Rational other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Rational(newNumerator, commonDenominator);
    }

    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public double abs() {
        return Math.abs(toDouble());
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

