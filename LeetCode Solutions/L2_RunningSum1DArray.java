import java.util.Arrays;
import java.util.Scanner;

public class L2_RunningSum1DArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int[] runningSum = new int[array.length];
 		
		for (int i = 0; i < array.length; i++) {
			int tempSum = 0;
			for (int j = 0; j <= i; j++) {
				tempSum += array[j];
			}
			runningSum[i] = tempSum;
		}
		
		System.out.print("Array with running sum: " + Arrays.toString(runningSum));
		
		scanner.close();

	}

}
