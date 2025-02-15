import java.util.*;

public class Fibonacci { 

    // Method to calculate the nth Fibonacci number
    public int fib(int n) { 
        if (n == 0) {
            return 0; // Base case: Fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci(1) = 1
        } else {
            return fib(n - 1) + fib(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(); // Creating an instance of Fibonacci
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        System.out.println("Enter a limit: ");
        int x = sc.nextInt(); // Read the limit for Fibonacci
        System.out.println("Fibonacci of " + x + " is: " + obj.fib(x)); // Output the result
    }
}
