 package chapter_5;

 import java.util.Scanner;

 public class SentinelLoop {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        sentinel(console);

    }

    // a sentinel loop which sums up user input
    //until -1 is chosen.
    public static void sentinel(Scanner console) {

        int num = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        System.out.print("Type a number (or -1 to stop): ");
        if (console.nextInt() == -1) {
            return;
        }

        while (num != -1) {
            num = console.nextInt();
            if (num > max) {
                max = num;
            }

            if (num < min && num > 0) {
                min = num;
            }
            System.out.print("another number? (-1 to quit): ");
        }
        


        System.out.println("Maximum was " + max);
        System.out.println("Minimum was " + min);

    }
}