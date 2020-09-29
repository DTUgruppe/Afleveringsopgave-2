import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class BuffonsNeedle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int input = getInput(myScanner);
        myScanner.close();
        int successfulAttempts = 0;
        
        for (int i = 0; i < input; i++) {
            double distance = myRandom.nextDouble() *2.0;
            double angle = myRandom.nextDouble() * 180;
            double top = distance + Math.sin(Math.toRadians(angle));
            if(top >= 2){
                successfulAttempts++;
            }
        }

        if( successfulAttempts > 0){
            System.out.println(input + " / " + successfulAttempts + " = " + (double)input/(double)successfulAttempts);
        } else {
            System.out.println("No successfull attempts, try a higher number");
        }
    }

    public static int getInput(Scanner myScanner) {
        System.out.print("Enter number of iterations: ");
        try {
            int input = myScanner.nextInt();
            return input;
            
        } catch (Exception e) {
            System.out.println("Invalid input. ");
            //Next line is to clear the scanner to avoid infinite loop
            myScanner.next();
            return getInput(myScanner);
        }
    }
}
