public class DivisionExample {

    public static void performDivision(int dividend, int divisor) {
        try {
            int quotient = dividend / divisor;
            System.out.println("Result of division: " + quotient);
        } catch (ArithmeticException exception) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        performDivision(dividend, divisor);
    }
}
