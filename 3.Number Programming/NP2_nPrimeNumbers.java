import java.util.Scanner;

public class NP2_nPrimeNumbers {

	public static void main(String[] args)  {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many prime numbers to print? - ");
		int num = scanner.nextInt();
		int naturalNum = 2;
		int primeNumCount = 0;
		System.out.println("The first " + num + " prime numbers are:");
		while (primeNumCount < num) {
			if(isPrime(naturalNum)) primeNumCount++;
			naturalNum++;
		}
		scanner.close();

	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}
		System.out.println(n);
		return true;
	}

}