import java.util.Scanner;

public class L1_NumbersWithEvenDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int[] array = new int[scanner.nextInt()];
		
		System.out.print("Enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
//			if(digitCounter(array[i]) % 2 == 0) count++;
			if((int) (Math.log10(array[i]) + 1) % 2 == 0) count++;
		}
		
		System.out.println("Total number of even numbered digits: " + count);
		
		scanner.close();

	}
//	
//	public static int digitCounter(int num) {
//		int dc = 0;
//		while(num > 0) {
//			num /= 10;
//			dc++;
//		}
//		return dc;
//	}

}
