import java.util.Scanner;

public class ADS3_Creating3DArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array rows, columns, and depth: ");
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int depth = scanner.nextInt();
		
		int[][][] array3D = new int[rows][cols][depth];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter elements for row " + i + ", column " + j + ": ");
				for (int k = 0; k < depth; k++) {
					array3D[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		System.out.println("Entered elements successfully.\n3D Array elements are:");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Row " + i + ", Column " + j + ": ");
				for (int k = 0; k < depth; k++) {
					System.out.print(array3D[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
		scanner.close();

	}

}
