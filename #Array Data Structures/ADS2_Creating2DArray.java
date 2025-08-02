import java.util.Scanner;

public class ADS2_Creating2DArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of columns: ");
		int cols = scanner.nextInt();
		
		int[][] array2D = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter element for row " + (i+1) + " and column " + (j+1) + ": ");
				array2D[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < cols; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
		
	}

}
