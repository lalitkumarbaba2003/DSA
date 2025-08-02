import java.util.Scanner;

public class NP1_PerfectSquare {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		int rootNum = (int) Math.sqrt(num);
		
		if(rootNum*rootNum == num) {
			System.out.println(num + " is a perfect square.");
		} else {
			System.out.println(num + " is not a perfect square.");
		}
		
		scanner.close();

	}

}
