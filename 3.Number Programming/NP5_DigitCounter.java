import java.util.Scanner;

public class NP5_DigitCounter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to count number of digits in it: ");
		int num = scanner.nextInt();
		
		System.out.println("The number " + num + " has " + digitCounter(num) + " digits.");
		
		scanner.close();

	}

	public static int digitCounter(int num) {
		int digits = 0;
		while(num > 0) {
			num /= 10;
			digits++;
		}
		return digits;
	}

}
