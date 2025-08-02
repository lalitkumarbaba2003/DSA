import java.util.Scanner;

public class SDS1_CreationofString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Using String class\nEnter your first name: ");
		String firstName = scanner.next();
		System.out.print("Enter your last name: ");
		String lastName = scanner.next();
		System.out.println("Hey " + firstName + " " + lastName + ", what's Up!!!");
		
		System.out.print("\nUsing StringBuilder class\nEnter your first name: ");
		StringBuilder firstName1 = new StringBuilder(scanner.next());
		System.out.print("Enter your last name: ");
		firstName1.append(" " + scanner.next());
		System.out.println("Hey " + firstName1 + ", what's Up!!!");
		
		System.out.print("\nUsing StringBuffer class\nEnter your first name: ");
		StringBuffer firstName2 = new StringBuffer(scanner.next());
		System.out.print("Enter your last name: ");
		firstName2.append(" " + scanner.next());
		System.out.println("Hey " + firstName2 + ", what's Up!!!");

		scanner.close();
		
	}

}
