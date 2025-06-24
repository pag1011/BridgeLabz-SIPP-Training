
import java.util.*;

class PalindromeStringChecker {
	String text;
	
	//Constructor
	PalindromeStringChecker(String text) {
		this.text = text;
	}
	
	//Method to check palindrome string
	boolean isPalindrome() {
		String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
	}
	
	//Method to display the final string
	void display() {
		System.out.println("Text : " + text);
		if(isPalindrome()) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("The text is not a palindrome.");
		}
	}
}

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text;
		
		System.out.println("Enter the string : ");
		text = sc.nextLine();
		
		//Create palcheck object for input user
		PalindromeStringChecker palcheck = new PalindromeStringChecker(text);
		
		//Display the final text
		palcheck.display();

	}

}
