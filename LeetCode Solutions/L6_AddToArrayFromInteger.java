import java.util.Arrays;
import java.util.Scanner;

public class L6_AddToArrayFromInteger {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Enter a number to add: ");
		int k = scanner.nextInt();
		
		char [] onePlusArray = addInteger(array, k).toCharArray();
		
		System.out.print("Array Plus Integer: " + Arrays.toString(onePlusArray));
		
		scanner.close();
	
	}
	
	public static String addInteger(int[] arr, int n) {
		int num = 0, j = 1;
		for (int i = arr.length-1; i >= 0; i--) {
			num += j * arr[i];
			j *= 10;
		}
		return Integer.toString(num+n);
	}

}
