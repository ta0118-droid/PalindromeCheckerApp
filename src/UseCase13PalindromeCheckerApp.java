import java.util.Stack;

/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String testInput = "racecar";

        // Strategy 1: Stack-based
        PalindromeStrategy stackStrategy = new StackStrategy();
        benchmarkStrategy(stackStrategy, "Stack-based Strategy", testInput);

        // Strategy 2: Two-Pointer (Encapsulated from UC 11/12 logic)
        PalindromeStrategy pointerStrategy = new TwoPointerStrategy();
        benchmarkStrategy(pointerStrategy, "Two-Pointer Strategy", testInput);
    }

    /**
     * Helper method to capture and display benchmarking results.
     */
    private static void benchmarkStrategy(PalindromeStrategy strategy, String name, String input) {
        // Capture start time in nanoseconds for high precision
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean result = strategy.isValid(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        System.out.println("--- Benchmarking: " + name + " ---");
        System.out.println("Input: " + input + " | Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " ns\n");
    }
}

/**
 * Strategy Interface (from UC 12)
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * Concrete Strategy: Stack-based (from UC 12)
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return input.equalsIgnoreCase(reversed.toString());
    }
}

/**
 * Concrete Strategy: Two-Pointer (Logic from UC 11 hint)
 */
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}