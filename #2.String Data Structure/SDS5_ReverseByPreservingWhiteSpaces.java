import java.util.Scanner;

public class SDS5_ReverseByPreservingWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String sentence = scanner.nextLine();
		
		System.out.println("Original String: " + sentence);
		
		char[] reversedSentence = new char[sentence.length()];
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				reversedSentence[i] = ' ';
			}
		}
				
		sentence = sentence.replaceAll(" ", "");
		
		int j = sentence.length()-1;
		for (int i = 0; i < reversedSentence.length; i++) {
			if(reversedSentence[i] == ' ') {
				continue;
			} else {
				reversedSentence[i] = sentence.charAt(j);
				j--;
			}
		}
		
		System.out.println("Reversed String with white spaces preserved: " + new String(reversedSentence));
		
		scanner.close();
		
	}

}
