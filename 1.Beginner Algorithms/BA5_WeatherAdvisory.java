import java.util.Scanner;

public class BA5_WeatherAdvisory {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter surrounding temperature: ");
		int temperature = scanner.nextInt();
		
		if(temperature >= 50) {
			System.out.println("Advice: Stay indoors...");
		} else if(temperature  >= 35) {
			System.out.println("Advice: Wear light clothes.");
		} else if(temperature >= 25) {
			System.out.println("Advice: Wear a jacket.");
		} else {
			System.out.println("Advice: Stay warm and wear a jacket.");
		}

		scanner.close();

	}

}
