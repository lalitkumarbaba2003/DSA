import java.util.Arrays;
import java.util.Scanner;

public class L5_PlusOne {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		char [] onePlusArray = plusOne(array).toCharArray();
		
		System.out.print("Array with Plus One: " + Arrays.toString(onePlusArray));
		
		scanner.close();
		
	}
	
	public static String plusOne(int[] arr) {
		int num = 0, j = 1;
		for (int i = arr.length-1; i >= 0; i--) {
			num += j * arr[i];
			j *= 10;
		}
		return Integer.toString(num+1);
	}

}
