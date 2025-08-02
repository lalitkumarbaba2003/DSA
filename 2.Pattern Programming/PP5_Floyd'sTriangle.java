import java.util.Scanner;

public class PP5_FloydsTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter height of trianlge: ");
		int h = scanner.nextInt();
		
		System.out.print("Enter a number to start the triangle with: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((n++) + " ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
