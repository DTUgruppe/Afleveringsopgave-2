import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter line to check:");
		String palindrome = input.nextLine();
		System.out.print("\"" + palindrome + "\" ");
		boolean isPalindrome=true;
		
		//tekstbehandling som fjerner tegn, mellemrum og laver alle bogstaver små
		// dette gør sammenligning af characters nemmere
		palindrome=palindrome.replaceAll("\\W", "");
		palindrome=palindrome.replaceAll("\\s", "");
		palindrome=palindrome.toLowerCase();
		
		for (int i=0; i<palindrome.length()/2+1; i++) {
			
			if(!(palindrome.charAt(i)==palindrome.charAt(palindrome.length()-1-i))) {
				isPalindrome=false;
				break;
			}
		}
		
		if (isPalindrome) {
			System.out.print("is a palindrome!");
		}
		else {
			System.out.print("is not a palindrome!");
			
		}
	}

}
