import java.util.Scanner;

public class BA7_LeapYearChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an year: ");
		int year = scanner.nextInt();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not leap year!!!");
		}

		scanner.close();
		
	}

}
