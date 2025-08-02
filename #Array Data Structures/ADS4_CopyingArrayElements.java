import java.util.Scanner;

public class ADS4_CopyingArrayElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter all array elements: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int[] arrayCopy = new int[array.length];
		for(int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = array[i];
		}
		
		System.out.print("Original Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.print("\nCopied Array: ");
		for(int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
		
		scanner.close();

	}

}
