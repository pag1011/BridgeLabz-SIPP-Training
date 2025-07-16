import java.util.Scanner;

public class AnagramChecker {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;   
            freq[str2.charAt(i)]--;   
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
