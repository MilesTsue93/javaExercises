package chapter_5;
import java.util.Scanner;

public class zeroDigits {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        //prompts user for integer parameter
        System.out.print("type an integer: ");
        int count = 0;
        int num = console.nextInt();

        do {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        } while (num != 0);

        System.out.println("Your number had " + count + " zeros in it.");


        // here is a separate method altogether, unrelated to this first one. //

        // prompt user for an integer
        System.out.print("Type an integer: ");
        int number = console.nextInt();

        String newNumOdd = "";
        String newNumEven = "";
        //process digits one at a time checking for odd or even
        // process odds first, then evens, then
        //concatenate them, then finally, conver to integer again.
        while (number != 0) {
            if ((number % 10) % 2 != 0) {
                newNumOdd = (number % 10) + newNumOdd;
                number /= 10;
            } else if ((number % 10) % 2 == 0) {
                newNumEven = (number % 10) + newNumEven;
                number /= 10;
            }
        }

        String newNumber = newNumOdd + newNumEven;
        System.out.println("Here is your new number: " + newNumber);




    }    
}


