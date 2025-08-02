import java.util.Scanner;

public class SDS8_CompressString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String word = scanner.nextLine();
		
		String compressedString = "";
		int count = 1;
		
		for(int i = 1; i < word.length(); i++) {
			if(word.charAt(i) == word.charAt(i-1)) {
				count++;
			} else {
				compressedString += word.charAt(i-1) + Integer.toString(count);
				count = 1;
			}
		}
		
		compressedString += word.charAt(word.length()-1) + Integer.toString(count);
		
		System.out.println("Compressed String: " + compressedString);
		
		scanner.close();

	}

}
