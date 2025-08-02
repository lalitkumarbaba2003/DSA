import java.util.Scanner;

public class RA2_GCD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scanner.nextInt();
		
		System.out.print("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
		
		scanner.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}
