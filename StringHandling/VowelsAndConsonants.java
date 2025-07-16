import java.util.Scanner;

public class VowelsAndConsonants {
	
	//Function to count vowels
	public static int countVowels(String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	//Function to count consonants
	public static int countConsonants(String str) {
		int count = 0;
		str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String input = sc.nextLine();
		
		int vowelCount = countVowels(input);
		int consonantCount = countConsonants(input);
		
		System.out.println("Number of vowels : " + vowelCount);
		System.out.println("Number of consonants : " + consonantCount);
	}

}
