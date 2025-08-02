import java.util.Scanner;

public class BA6_VowelChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a lowercase character: ");
		char inputCharacter = scanner.next().charAt(0);
		
		switch (inputCharacter) {
		    case 'a': 
				System.out.println("Vowel");
				break;
			case 'e': 
				System.out.println("Vowel");
				break;
			case 'i': 
				System.out.println("Vowel");
				break;
			case 'o': 
				System.out.println("Vowel");
				break;
			case 'u': 
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
				break;
		}
		
		scanner.close();

	}

}
