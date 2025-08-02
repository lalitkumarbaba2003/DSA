import java.util.Scanner;

public class SDS2_CopyingStringUsingArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String fullName = scanner.nextLine();
		System.out.println("Original Name: " + fullName);
		
		char[] stringArray = fullName.toCharArray();

		String copiedName = "";		
		for (int i = 0; i < stringArray.length; i++) {
			copiedName += stringArray[i];
		}
		System.out.println("Copied Name: " + copiedName);
		
		scanner.close();
		
//		or we can also create a string object instead of creating a string in string pool.
//		after taking user input And converting it into char array, we can create new copiedString without for loop;
//		String copiedName = new String(stringArray);
		
	}

}
