import java.util.Scanner;

public class ADS9_SumOfOddIndexedElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter all array elements: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int sum = 0;
		
		System.out.print("Array Elements: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if(!(i%2 == 0)) sum += array[i];
		}
		
		System.out.println("\nThe sum of odd-indexed array elements is " + sum +".");
		
		scanner.close();

	}

}
