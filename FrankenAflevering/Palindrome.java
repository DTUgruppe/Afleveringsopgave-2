import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        clearScreen();
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" ___________________________________ ");
        System.out.println("| Welcome to the palindrome checker |");
        System.out.println("|        Type \"exit\" to exit        |");
        System.out.println(" ⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻ ");
        checkString(myScanner);
        myScanner.close();
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void clearTwoLines() {
        System.out.print(String.format("\033[%dA",1)); // Move up
        System.out.print("\033[2K"); //remove text
        System.out.print(String.format("\033[%dA",1)); // Move up
        System.out.print("\033[2K"); //remove text
    }

    public static void checkString(Scanner myScanner) {
        System.out.print("\nEnter line to check: ");
        String input = myScanner.nextLine();
        if(input.equals("exit")){
            return;
        }

        //Clean the input of anything that isn't a letter or a number
        String text = input.replaceAll("[^a-zA-Z1-9]", "").toLowerCase();
        Boolean isAPalindrome = true;
        
        for (int i = 0; i < text.length() / 2; i++) {
            //Find index of the letter to match
            int iR = text.length() - i -1;
            
            if (!(text.charAt(i)== text.charAt(iR))){
                //if 2 characters doesn't match at any point.
                isAPalindrome = false;
                break;
            }
        }
        clearTwoLines();

        System.out.print("\"" + input + "\" ");
        if(isAPalindrome){
            System.out.println("is a palindrome! ");
        } else {
            System.out.println("is not palindrome. ");
        }
        checkString(myScanner);
    }
}