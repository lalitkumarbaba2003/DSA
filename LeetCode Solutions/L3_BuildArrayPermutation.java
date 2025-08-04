import java.util.Arrays;
import java.util.Scanner;

public class L3_BuildArrayPermutation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int[] builtArray = new int[array.length];
		
		for (int i = 0; i < builtArray.length; i++) {
			builtArray[i] = array[array[i]];
		}
		
		System.out.print("Array with Permutation: " + Arrays.toString(builtArray));
		
		scanner.close();

	}

}
