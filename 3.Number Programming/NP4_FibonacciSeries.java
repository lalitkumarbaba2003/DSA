import java.util.Scanner;

public class NP4_FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number upto which Fibonacci series must be printed: ");
		int n = scanner.nextInt();
		
		fibonacci(n);

        scanner.close();
		
	}
	
	public static void fibonacci(int n) {
		int f1 = 0, f2 = 1;
		String fibonacciSeries = f1 + "";
		System.out.print("Fibonacci series up to " + n + ": ");
		if(n == 0) {
			System.out.println(fibonacciSeries);
		} else {
			while(f2 <= n) {
				fibonacciSeries += " " + f2;
				int temp = f1+f2;
				f1 = f2;
				f2 = temp;
			}
			System.out.println(fibonacciSeries);
		}
	}

}
