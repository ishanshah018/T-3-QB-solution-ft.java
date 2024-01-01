//QB 604

class Ex1 {

    public static void main(String[] args) {
        Calculator ab = new Calculator();

        // Example usage
        int ans1 = ab.calculate(5, 3);
        System.out.println("Result of integer addition: " + ans1);

        double ans2 = ab.calculate(5.5, 2.5);
        System.out.println("Result of double addition: " + ans2);

        int ans3 = ab.calculateSubtraction(10, 4);
        System.out.println("Result of integer subtraction: " + ans3);

        double ans4 = ab.calculateSubtraction(8.5, 3.0);
        System.out.println("Result of double subtraction: " + ans4);

        int ans5 = ab.calculateMultiplication(6, 7);
        System.out.println("Result of integer multiplication: " + ans5);

        double ans6 = ab.calculateMultiplication(2.5, 4.0);
        System.out.println("Result of double multiplication: " + ans6);

        int ans7 = ab.calculateDivision(12, 4);
        System.out.println("Result of integer division: " + ans7);

        double ans8 = ab.calculateDivision(10.0, 2.0);
        System.out.println("Result of double division: " + ans8);

        // Example of division by zero
        double resultDivideByZero = ab.calculateDivision(8.0, 0.0);
        // The program will print an error message, and the result will be 0.0
    }
}

class Calculator {

    // Addition methods
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    // Subtraction methods
    int calculateSubtraction(int a, int b) {
        return a - b;
    }

    double calculateSubtraction(double a, double b) {
        return a - b;
    }

    // Multiplication methods
    int calculateMultiplication(int a, int b) {
        return a * b;
    }

    double calculateMultiplication(double a, double b) {
        return a * b;
    }

    // Division methods
    int calculateDivision(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    double calculateDivision(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0.0;

        }
    }
}
