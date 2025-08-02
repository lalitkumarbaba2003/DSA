import java.util.Scanner;

public class BA1_Swap2NumbersUsingTemp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter two numbers (a & b) to swap: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Before swap:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		
		int temp = a; //creating a temporary variable 'temp' and assigning a in it.
		a = b; //now assigning b to a.
		b = temp; //finally, assigning value of 'temp' (actual value of a) to b.
		
		System.out.println("Before swap:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		
		scanner.close();

	}

}
