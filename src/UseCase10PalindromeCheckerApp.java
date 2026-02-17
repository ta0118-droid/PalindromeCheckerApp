/**
 * ==========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ==========================================================
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing 
 * the input string.
 * * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        // Step 1: Normalization
        // [^a-zA-Z0-9] replaces all non-alphanumeric characters with an empty string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Palindrome Logic (As per your hint)
        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Output Result
        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}