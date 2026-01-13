import java.util.Scanner;

public class LongestWordFinder {

    // Function to find the longest word in the sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); 
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();

        String longestWord = findLongestWord(sentence);

        System.out.println("Longest word : " + longestWord);
    }
}
