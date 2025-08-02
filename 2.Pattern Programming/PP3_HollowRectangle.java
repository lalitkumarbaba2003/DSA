import java.util.Scanner;

public class PP3_HollowRectangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter height of the rectangle: ");
		int h = scanner.nextInt();
		
		System.out.print("Enter width of the rectangle: ");
		int w = scanner.nextInt();
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				if(j == 1 || j == w || i == 1 || i == h) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
