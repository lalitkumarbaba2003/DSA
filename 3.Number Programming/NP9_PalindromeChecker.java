import java.util.Scanner;

public class NP9_PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to check its palindrome nature: ");
		int num = scanner.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println(num + " is a palindrome.");
		} else {
			System.out.println(num + " is not a palindrome!!!");
		}
		
		scanner.close();

	}
	
	public static boolean isPalindrome(int num) {
		int reversedNum = 0, copyNum = num;
		while(num > 0) {
			reversedNum = reversedNum*10 + num%10;
			num /= 10;
		}
		if(reversedNum == copyNum) return true;
		return false;
	}

}
