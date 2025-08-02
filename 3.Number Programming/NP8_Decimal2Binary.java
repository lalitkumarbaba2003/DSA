public class NP8_Decimal2Binary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to convert it into binary number: ");
		int decimalNum = scanner.nextInt();
		
		System.out.println("The binary equivalent of " + decimalNum + " is " + decimal2binary(decimalNum));
		
		scanner.close();
		
	}
	
	public static int decimal2binary(int decimalNum) {
		int binaryNum = 0, i = 1;
		while (decimalNum > 0) {
			binaryNum += (decimalNum%2) * i;
			i *= 10;
			decimalNum /= 2;
		}
		return binaryNum;
	}

}
