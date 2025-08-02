import java.util.Scanner;

public class SDS8_ReplaceVowelsInString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String word = scanner.nextLine();
		
		char[] wordArray = word.toCharArray();
		
		System.out.print("Enter a character you want to replace the word with: ");
		char character = scanner.next().charAt(0);
		
		String vowels = "aeiouAEIOU";
		
		System.out.print("String with replaced characters: ");
		for (int i = 0; i < wordArray.length; i++) {
			if(vowels.indexOf(wordArray[i]) != -1) {
				wordArray[i] = character;
			}
			System.out.print(wordArray[i]);
		}		
		
		scanner.close();

	}

}
