import java.util.Scanner;

public class RA3_FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a position to find respective fibonacci number: ");
		int num = scanner.nextInt();
		
		System.out.println("The " + num + "th term in fibonacci series is " + fib(num));
		
		scanner.close();
		
	}
	
	public static int fib(int num) {
		if(num == 0) return 0;
		else if(num == 1) return 1;
		return fib(num-1) + fib(num-2);
	}

}
