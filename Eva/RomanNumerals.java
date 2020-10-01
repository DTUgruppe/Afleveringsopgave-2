import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);
		int n = getmyInput(myInput);
		String roman ="";
		boolean numbersToConvert=true;	
		
		while (numbersToConvert) {
			if (n<=0) {
				numbersToConvert=false;
			}
			while (n/1000>0) {
				roman=roman.concat("M");
				n-=1000;
				
			}
			while (n/500>0) {
				if (n%1000>=900) {
					roman=roman.concat("CM");
					n-=900;
					break;
				}
				roman=roman.concat("D");
				n-=500;
			}
			while (n/100>0) {
				if (n%500>=400) {
					roman=roman.concat("CD");
					n-=400;
					break;
				}
				roman=roman.concat("C");
				n-=100;
			}
			while (n/50>0) {
				if (n%100>=90) {
					roman=roman.concat("XC");
					n-=90;
					break;
				}
				roman=roman.concat("L");
				n-=50;
			}
			while (n/10>0) {
				if (n%50>=40) {
					roman=roman.concat("XL");
					n-=40;
					break;
				}
				roman=roman.concat("X");
				n-=10;
			}
			while (n/5>0) {
				if (n%10>=9) {
					roman=roman.concat("IX");
					n-=9;
					break;
				}
				roman=roman.concat("V");
				n-=5;
			}
			while (n/1>0) {
				if (n%5>=4) {
					roman=roman.concat("IV");
					n-=4;
					break;
				}
				roman=roman.concat("I");
				n-=1;
			}
		}
		System.out.println("Roman number:"+ roman);

	}
	public static int getmyInput(Scanner myInput) {
		System.out.print("Enter positive interger to convert to roman numeral:");
		int n;
		if(myInput.hasNextInt()){
			n = myInput.nextInt();
			return n;
		} else {
			System.out.println("Invalid myInput. ");
			//Next line is to clear the scanner to avoid infinite loop
			myInput.next();
			return getmyInput(myInput);
		}
		
	}

}
