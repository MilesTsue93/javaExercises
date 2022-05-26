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
    }
}
