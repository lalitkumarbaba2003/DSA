import java.util.Scanner;

public class BA2_Swap2NumbersWithoutTemp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter two numbers (a & b) to swap: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Before swap:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		
		a = a + b; //adding both a and b, then assigning it to a.
		b = a - b; //now, subtracting b from a, then assigning it to b.
		a = a - b; //finally, again subtracting b from a, and assigning the value to a.
		
		System.out.println("Before swap:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		
		scanner.close();

	}

}
