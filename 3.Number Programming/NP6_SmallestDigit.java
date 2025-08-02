import java.util.Scanner;

public class NP6_SmallestDigit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to find smallest digit in it: ");
		int num = scanner.nextInt();
		
		System.out.println("The smallest digit in " + num + " is " + smallestDigit(num));
		
		scanner.close();

	}
	
	public static int smallestDigit(int num) {
		int smallestNum = Integer.MAX_VALUE;
		while(num > 0) {
			if(num%10 < smallestNum) smallestNum = num%10;
			num /= 10;
		}
		return smallestNum;
	}

}
