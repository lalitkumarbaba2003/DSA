import java.util.Scanner;

public class PP4_HourGlass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter upper height of hour glass: ");
		int n = scanner.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j < 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
