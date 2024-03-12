class CustomValidationException extends Exception {
    public CustomValidationException(String errorMessage) {
        super(errorMessage);
    }
}

class NumericValidator {
    public static void validateNonNegativeNumber(int numericValue) throws CustomValidationException {
        if (numericValue < 0) {
            throw new CustomValidationException("Numeric value cannot be negative");
        }
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int numericValue = -5;
        try {
            NumericValidator.validateNonNegativeNumber(numericValue);
            System.out.println("Numeric value is valid: " + numericValue);
        } catch (CustomValidationException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
