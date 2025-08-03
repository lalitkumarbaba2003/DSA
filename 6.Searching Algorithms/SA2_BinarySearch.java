package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class SA2_BinarySearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 		System.out.print("Array: " + Arrays.toString(array));
 		
 		System.out.print("\nEnter element to search: ");
 		int key = scanner.nextInt();
 		
 		int index = binarySearch(array, key);
 		if(index != -1) {
 			System.out.println("The element \'" + key + "\' found at position " + index + ".");
 		} else {
			System.out.println("The element \'" + key + "\' was not found.");
		}
 		
 		scanner.close();
		
	}
	
	public static int binarySearch(int[] array, int key) {
		int start = 0;
		int end = array.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(array[mid] == key) return mid;
			else if(array[mid] > key) end = mid-1;
			else if(array[mid] < key) start = mid+1;
		}
		return -1;
	}

}
