import java.util.Scanner;

public class SubstringOccurrence {

    // Function to count occurrences of a substring in a string
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        // Loop through the string using indexOf
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); 
        }
        return count;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // Input string and substring from user
        System.out.print("Enter the main string : ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to search : ");
        String subStr = sc.nextLine();

        int occurrences = countOccurrences(str, subStr);

        System.out.println("Number of occurrences : " + occurrences);
    }
}
