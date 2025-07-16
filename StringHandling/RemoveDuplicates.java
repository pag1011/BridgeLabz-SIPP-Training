import java.util.Scanner;

public class RemoveDuplicates {

    // Function to remove duplicate characters using StringBuilder
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is not already in result
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch); 
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String output = removeDuplicates(input);

        System.out.println("String after removing duplicates : " + output);
    }
}
