public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
        scanner.close();
    }

    /**
     * Validates palindrome using two-pointer technique on a char array.
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;

        // Convert string to char array as per Use Case 4 requirements
        char[] charArray = str.toLowerCase().toCharArray();

        int left = 0;                 // Start pointer
        int right = charArray.length - 1; // End pointer

        while (left < right) {
            // Compare characters at both pointers
            if (charArray[left] != charArray[right]) {
                return false; // Not a palindrome
            }
            left++;  // Move start pointer forward
            right--; // Move end pointer backward
        }
        return true;
    }
}