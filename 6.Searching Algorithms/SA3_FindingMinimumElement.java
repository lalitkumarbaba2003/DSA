import java.util.Arrays;
import java.util.Scanner;

public class SA3_FindingMinimumElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		int minimumElement = Integer.MAX_VALUE;
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			if(minimumElement > array[i]) minimumElement = array[i];
		}
 		System.out.print("Array: " + Arrays.toString(array) + "\nAnd minimum element in the array is " + minimumElement + ".");
 		
 		scanner.close();

	}

}
