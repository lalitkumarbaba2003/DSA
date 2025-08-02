import java.util.Scanner;

public class BA3_AreaOfACircle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		double radius = scanner.nextFloat();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is " + area);
		
		scanner.close();

	}

}
