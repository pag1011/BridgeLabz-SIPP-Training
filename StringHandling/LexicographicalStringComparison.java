import java.util.Scanner;

public class LexicographicalStringComparison {

    // Function to compare two strings lexicographically without built-in methods
    public static String compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (ch1 > ch2) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
            }
        }

        // If all characters matched so far, the shorter one comes first
        if (len1 < len2) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (len1 > len2) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        } else {
            return "Both strings are equal";
        }
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        String str2 = sc.nextLine();

        String result = compareStrings(str1, str2);

        System.out.println(result);
    }
}
