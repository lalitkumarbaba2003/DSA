import java.util.Scanner;

public class NP3_GCD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two numbers to print its GCD: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a,b) + ".");
		scanner.close();

	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

}
