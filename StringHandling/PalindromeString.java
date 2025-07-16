import java.util.Scanner;

public class PalindromeString {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
