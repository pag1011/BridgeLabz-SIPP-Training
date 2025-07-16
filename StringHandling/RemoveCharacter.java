import java.util.Scanner;

public class RemoveCharacter {

    // Function to remove all occurrences of a given character
    public static String removeChar(String str, char removeChar) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != removeChar) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove : ");
        char removeChar = sc.next().charAt(0);

        String modified = removeChar(input, removeChar);

        System.out.println("Modified String : " + modified);
    }
}
