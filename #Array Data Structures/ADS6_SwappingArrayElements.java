import java.util.Scanner;

public class ADS6_SwappingArrayElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter all array elements: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Enter two positions of array to swap elements (note: array starts from position 0): ");
		int pos1 = scanner.nextInt();
		int pos2 = scanner.nextInt();
		
		if(pos1 >= 0 && pos1 != pos2 && pos2 < array.length) {
			int temp = array[pos2];
			array[pos2] = array[pos1];
			array[pos1] = temp;
		} else {
			System.out.println("No SWAPPING carried out, due to incorrect position(s).");
		}
		
		System.out.print("Array Elements: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		scanner.close();

	}

}
