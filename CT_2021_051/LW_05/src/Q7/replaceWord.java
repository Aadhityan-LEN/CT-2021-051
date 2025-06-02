package Q7;
import java.util.Scanner;

public class replaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Get the word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();

        // Get the new word
        System.out.print("Enter replacement word: ");
        String newWord = scanner.next();

        // Replace all occurrences
        String newSentence = sentence.replace(oldWord, newWord);

        // Display the result
        System.out.println("New sentence: " + newSentence);

        scanner.close();
    }

}


