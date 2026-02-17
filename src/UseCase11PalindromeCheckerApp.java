/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using 
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a 
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Developer
 * @version 11.0
 */
public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the service
        PalindromeService service = new PalindromeService();

        String testInput = "racecar";

        // Use the service to check the string
        boolean result = service.checkPalindrome(testInput);

        System.out.println("Input: " + testInput);
        System.out.println("Is Palindrome: " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            // If characters at current pointers don't match, it's not a palindrome
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            // Move pointers inward
            start++;
            end--;
        }

        return true;
    }
}