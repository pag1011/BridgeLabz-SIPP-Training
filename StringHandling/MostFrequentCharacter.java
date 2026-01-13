import java.util.Scanner;

public class MostFrequentCharacter {

    // Function to find the most frequent character
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the character with the highest frequency
        int maxFreq = 0;
        char mostFreqChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFreqChar = ch;
            }
        }

        return mostFreqChar;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        char result = findMostFrequentChar(input);

        System.out.println("Most Frequent Character : '" + result + "'");
    }
}
