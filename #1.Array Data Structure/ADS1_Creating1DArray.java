import java.util.Scanner;

public class ADS1_Creating1DArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter size of 1D array: ");
		int size = scanner.nextInt();
		
		int[] array1D = new int[size];
		
		for(int i = 0; i < array1D.length; i++) {
			System.out.print("Enter value for position " + (i+1) + ": ");
			array1D[i] = scanner.nextInt();
		}
		
		System.out.println("Entered elements successfully.\nArray elements are:");
		for (int i = 0; i < array1D.length; i++) {
			System.out.print(array1D[i] + " ");
		}
		
		scanner.close();
		
	}

}
