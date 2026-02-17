import java.util.Scanner;

/**
 * Use Case 9: Recursive Palindrome Checker
 * This class validates a palindrome using recursion.
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (Recursive): ");
        String input = scanner.nextLine();

        // Standardize input (lowercase) for consistent validation
        String processedInput = input.toLowerCase();

        // Initial call to the recursive check method
        boolean result = check(processedInput, 0, processedInput.length() - 1);

        if (result) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case 1: All characters are matched (start meets or passes end)
        if (start >= end) {
            return true;
        }

        // Base Case 2: A mismatch is found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Compare the next set of characters moving inward
        return check(s, start + 1, end - 1);
    }
}