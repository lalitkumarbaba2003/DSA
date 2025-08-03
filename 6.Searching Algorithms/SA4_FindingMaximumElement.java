import java.util.Arrays;
import java.util.Scanner;

public class SA4_FindingMaximumElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		int maximumElement = Integer.MIN_VALUE;
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			if(maximumElement < array[i]) maximumElement = array[i];
		}
 		System.out.print("Array: " + Arrays.toString(array) + "\nAnd maximum element in the array is " + maximumElement + ".");
 		
 		scanner.close();
 		
	}

}
