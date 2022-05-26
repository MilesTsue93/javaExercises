 package chapter_5;

 import java.util.Scanner;

 public class SelfCheck {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        SentinelLoop(console);

    }

    // a sentinel loop which sums up user input
    //until -1 is chosen.
    public static void SentinelLoop(Scanner console) {

        int num;
        int max = 0;
        int min = Integer.MAX_VALUE;

        System.out.print("Type a number (or -1 to stop): ");

        do {
            num = console.nextInt();
            if (num > max) {
                max = num;
            }

            if (num < min && num > 0) {
                min = num;
            }

        System.out.print("another number? (-1 to quit): ");
        } while (num != -1);

        System.out.println("Maximum was " + max);
        System.out.println("Minimum was " + min);

    }
}