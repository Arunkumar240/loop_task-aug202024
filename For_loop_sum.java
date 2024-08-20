package first;
import java.util.Scanner;
public class For_loop_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        
        String reversedSentence = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        
        System.out.println("Reversed Sentence: " + reversedSentence.trim());
    }
}


