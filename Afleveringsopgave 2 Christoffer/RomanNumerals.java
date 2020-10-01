import java.util.Scanner;

public class RomanNumerals {
    public static final String[] UNITS = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};
    public static final String[] TENS = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static final String[] HUNDREDS = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public static final String[] THOUSANDS = {"","M","MM","MMM"};
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int input = getInput(myScanner);
        myScanner.close();
        int intInput = input;
        String romanOutput = "";

        romanOutput += THOUSANDS[input / 1000];
        input = input % 1000;

        romanOutput += HUNDREDS[input / 100];
        input = input % 100;

        romanOutput += TENS[input / 10];
        input = input % 10;

        romanOutput += UNITS[input];

        System.out.println(intInput + " = " + romanOutput);
    }

    public static int getInput(Scanner myScanner) {
        System.out.print("Enter positive integer to convert: ");
        String input = myScanner.next();
        try {
            if(Integer.parseInt(input) > 3999 || Integer.parseInt(input) < 0){
                System.out.println("Invalid input. ");
                return getInput(myScanner);
            } else{
                return Integer.parseInt(input);
            }
        } catch (final NumberFormatException e) {
            System.out.println("Invalid input. ");
            return getInput(myScanner);
        }
    }
}
