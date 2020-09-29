
public class Palindrome {
	
	public static void main(String[] args) {
		
		palindromeCheck("En af dem, der tit red med fane. ");
		
	}
	
	public static void palindromeCheck(String phrase) {
		
		String result = "";
		
		String phraseLetters = "";
		
		for (int i = 0; i <= phrase.length() - 1; i++) {
			
			char ch = phrase.charAt(i);
			
			if (Character.isLetter(ch) == true) {
				
				result = phrase.charAt(i) + result;
				
				phraseLetters += phrase.charAt(i);
				
			}
			
		}
		
		if (result.equalsIgnoreCase(phraseLetters)) {
			
			System.out.println("\"" + phrase + "\"" + " is a palindrome! ");
				
		} 
		
		else {
			
			System.out.println("\"" + phrase + "\"" + " isn't a palindrome. ");
			
		}
		
	}

}
