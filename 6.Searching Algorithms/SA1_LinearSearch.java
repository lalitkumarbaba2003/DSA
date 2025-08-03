import java.util.Arrays;
import java.util.Scanner;

public class SA1_LinearSearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {4, 7, 3, 5, 1, 6, 2, 9, 8};
 		System.out.print("Array: " + Arrays.toString(array));
 		
 		System.out.print("\nEnter element to search: ");
 		int key = scanner.nextInt();
 		
 		int index = linearSearch(array, key);
 		if(index != -1) {
 			System.out.println("The element \'" + key + "\' found at position " + index + ".");
 		} else {
			System.out.println("The element \'" + key + "\' was not found.");
		}
 		
 		scanner.close();

	}
	
	public static int linearSearch(int[] array, int key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) return i;
		}
		return -1;
	}

}
