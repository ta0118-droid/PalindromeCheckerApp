import java.util.Stack;

/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 * * @author Developer
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String testInput = "madam";

        // Inject the concrete Stack-based strategy at runtime
        PalindromeStrategy stackStrategy = new StackStrategy();

        // Execute the selected algorithm
        boolean isPalindrome = stackStrategy.isValid(testInput);

        System.out.println("Testing Strategy: Stack-based");
        System.out.println("Input: " + testInput);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * CLASS - StackStrategy
 * Implements a concrete Stack-based strategy for palindrome validation.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isValid(String input) {
        if (input == null) return false;

        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and compare with the original string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equalsIgnoreCase(reversed.toString());
    }
}