import java.util.Scanner;

public class SDS4_ReversingStringUsingStringBuilder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter string to reverse: ");
		StringBuilder original =  new StringBuilder(scanner.nextLine());
		System.out.println("Original String: " + original);
		
		System.out.println("Reversed String: " + original.reverse());
		
		scanner.close();

	}

}
