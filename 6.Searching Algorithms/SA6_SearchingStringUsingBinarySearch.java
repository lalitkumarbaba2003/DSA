import java.util.Arrays;
import java.util.Scanner;

public class SA6_SearchingStringUsingBinarySearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] array = {"Apple", "Banana", "Custard Apple", "Grapes", "Orange", "Pineapple"};
 		System.out.print("Array: " + Arrays.toString(array));

		System.out.print("\nEnter a string to search: ");
		String search = scanner.next();
		
 		int index = stringSearch(array, search);
 		if(index != -1) {
 			System.out.println("Product \'" + search + "\' found at position " + index + ".");
 		} else {
			System.out.println("Product \'" + search + "\' was not found.");
		}
 		
 		scanner.close();
 		
	}
	
	public static int stringSearch(String[] array, String key) {
		int start = 0;
		int end = array.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			int compare = key.compareTo(array[mid]);
			if(compare == 0) return mid;
			else if(compare < 0) end = mid-1;
			else if(compare > 0) start = mid+1;
		}
		return -1;
	}

}
