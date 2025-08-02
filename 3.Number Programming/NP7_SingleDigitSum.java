import java.util.Scanner;

public class NP7_SingleDigitSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to find its single digit sum: ");
		int num = scanner.nextInt();
		
		int sum = num;
		while (sum > 9) {
			sum = singleDigitSum(sum);
		}
		
		System.out.println("The single digit sum of " + num + " is " + sum);
		
		scanner.close();
		
	}
	
	public static int singleDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}

}
