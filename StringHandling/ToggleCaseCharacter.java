import java.util.Scanner;

public class ToggleCaseCharacter {

    // Function to toggle case of each character
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
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

        String toggled = toggleCase(input);

        System.out.println("Toggled string : " + toggled);
    }
}
