public class StrongNumber {
    public static void main(String[] args) {

        int number = 145;   // Change number to test
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number = number / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is NOT a Strong Number");
        }
    }

    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
