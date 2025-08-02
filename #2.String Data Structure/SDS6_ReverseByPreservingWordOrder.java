import java.util.Scanner;

public class SDS6_ReverseByPreservingWordOrder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String sentence = scanner.nextLine();
		System.out.println("Original string: " + sentence);
		
		System.out.print("Reversed String with preserved word order: ");
		String[] stringArray = sentence.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			String temp = stringArray[i];
			for (int j = temp.length()-1; j >= 0 ; j--) {
				System.out.print(temp.charAt(j));
			}
			System.out.print(" ");
		}
		
		scanner.close();
				
	}

}
