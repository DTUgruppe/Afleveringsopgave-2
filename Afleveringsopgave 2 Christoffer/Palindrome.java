import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter line to check: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        myScanner.close();

        //Clean the input of anything that isn't a letter or a number
        String text = input.replaceAll("[^a-zA-Z1-9]", "").toLowerCase();
        Boolean isAPalindrome = true;
        
        for (int i = 0; i < text.length() / 2; i++) {
            //Find index of the letter to match
            int iR = text.length() - i -1;
            
            if (!(text.charAt(i) == text.charAt(iR))){
                //if 2 characters doesn't match at any point.
                isAPalindrome = false;
                break;
            }
        }

        System.out.print("\"" + input + "\" ");
        if(isAPalindrome){
            System.out.println("is a palindrome!");
        } else {
            System.out.println("is not palindrome.");
        }
        

    }
    
}