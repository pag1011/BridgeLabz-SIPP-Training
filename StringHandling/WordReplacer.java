import java.util.Scanner;

public class WordReplacer {

    // Custom method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" "); 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // If word matches, replace it
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }
            // Add space between words except after last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString(); 
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace : ");
        String oldWord = sc.next();

        System.out.print("Enter the new word : ");
        String newWord = sc.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified sentence : " + modifiedSentence);
    }
}
