
public class RomanNumerals {
	
	public static void main(String[] args) {
		
		romanNumeralConvert(2321);
		
	}

	
	public static void romanNumeralConvert(int number) {
		
		int n = number;
		
		printRomanNumeral(divisibility(n, 1000), 'M');
		
		n = n - divisibility(n, 1000) * 1000;
		
		printRomanNumeral(divisibility(n, 500), 'D');
		
		n = n - divisibility(n, 500) * 500;
		
		printRomanNumeral(divisibility(n, 100), 'C');
		
		n = n - divisibility(n, 100) * 100;
		
		printRomanNumeral(divisibility(n, 50), 'L');
		
		n = n - divisibility(n, 50) * 50;
		
		printRomanNumeral(divisibility(n, 10), 'X');
		
		n = n - divisibility(n, 10) * 10;
		
		printRomanNumeral(divisibility(n, 5), 'V');
		
		n = n - divisibility(n, 5) * 5;
		
		printRomanNumeral(divisibility(n, 1), 'I');
		
		n = n - divisibility(n, 1) * 1;
		
	}
	
	public static int divisibility(int number, int denominator) {
		
		int timesDivisible = (int) number/denominator;
		
		return timesDivisible;
	}
	
	public static void printRomanNumeral(int number, char roman) {
		
		for (int i = 1; i <= number; i++) {
			
			System.out.print(roman);
			
		}
		
	}
	
}

