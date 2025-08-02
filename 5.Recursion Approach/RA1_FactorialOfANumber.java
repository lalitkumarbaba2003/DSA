import java.util.Scanner;

public class RA1_FactorialOfANumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial: ");
		
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n + " is " + factorial(n));

        scanner.close();
		
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
	
}
