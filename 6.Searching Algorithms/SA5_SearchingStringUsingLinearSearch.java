import java.util.Arrays;
import java.util.Scanner;

public class SA5_SearchingStringUsingLinearSearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] array = {"Shirts", "Trousers", "Sneakers", "Hoodies", "Shorts"};
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
		for(int i = 0; i < array.length; i++) {
			if(key.equals(array[i])) return i;
		}
		return -1;
	}

}
