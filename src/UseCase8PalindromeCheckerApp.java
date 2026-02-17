import java.util.LinkedList;
import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (UC8): ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) return true;

        // Step 1: Add characters to the list
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : str.toLowerCase().toCharArray()) {
            charList.add(c);
        }

        // Step 2: Compare by removing from both ends
        while (charList.size() > 1) {
            Character first = charList.removeFirst(); //
            Character last = charList.removeLast();   //

            if (!first.equals(last)) {
                return false;
            }
        }
        return true;
    }
}