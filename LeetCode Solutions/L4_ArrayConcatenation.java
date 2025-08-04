import java.util.Arrays;
import java.util.Scanner;

public class L4_ArrayConcatenation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int[] twiceArray = new int[array.length * 2];
		
		for (int i = 0; i < twiceArray.length; i++) {
			if(i < array.length) twiceArray[i] = array[i];
			else twiceArray[i] = array[i-array.length];
		}

		System.out.print("Array with Permutation: " + Arrays.toString(twiceArray));
		
		scanner.close();
		
	}

}
