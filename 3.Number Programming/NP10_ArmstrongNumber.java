import java.util.Scanner;

public class NP10_ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to check if it is Armstrong number or not: ");
		int num = scanner.nextInt();
		
		if (armstrongNum(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}
		
		scanner.close();
		
	}
	
	public static boolean armstrongNum(int num) {
		int numOfDigits = digitCounter(num);
		int copyNum = num, sum = 0;
		while (num > 0) {
			sum += Math.pow(num%10, numOfDigits);
			num /= 10;
		}
		if(copyNum == sum) return true;
		return false;
	}
	
	public static int digitCounter(int num) {
		int numOfDigits = 0;
		while (num > 0) {
			num /= 10;
			numOfDigits++;
		}
		return numOfDigits;
	}

}
