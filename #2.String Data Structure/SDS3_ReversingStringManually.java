import java.util.Scanner;

public class SDS3_ReversingStringManually {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse it: ");
		String original = scanner.nextLine();
		System.out.println("Original String: " + original);
		
		String reversed = "";
		for (int i = original.length()-1; i >= 0; i--) {
			reversed += original.charAt(i);
		}
		System.out.println("Reversed String: " + reversed);
		
		scanner.close();

	}

}
