import java.util.Scanner;

public class SDS7_CountWordsInSentence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] words = sentence.split(" ");
		
		System.out.println("Numbers of words: " + words.length);
		
		scanner.close();

	}

}
