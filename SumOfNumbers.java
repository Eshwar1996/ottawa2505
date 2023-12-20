import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");

        // Validate that the input is a positive integer
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid positive integer.");
            System.out.print("Enter a positive integer (n): ");
            scanner.next(); // Consume the invalid input
        }

        int n = scanner.nextInt();
        scanner.close();

        // Calculate the sum of the first n natural numbers
        int sum = calculateSum(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        System.out.println("Test");
    }

    // Function to calculate the sum of the first n natural numbers
    private static int calculateSum(int n) {
        // Sum formula: sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}
