package chapter_5;
import java.util.Scanner;
public class IntegerOrReal {
    public static void main(String[] args) {
        // scanner object
        Scanner console = new Scanner(System.in);

        // prompt user
        System.out.print("Type a number: ");

        if (console.hasNextInt()) {
            int num = console.nextInt();
            System.out.println("You tyoed the integer " + num);
        } else if (console.hasNextDouble()) {
            double num = console.nextDouble();
            System.out.println("You typed the real number " + num);
        }

        int avg = getAverage(console);
        System.out.println(avg);
    }


    public static int getAverage(Scanner console) {
        System.out.print("Type three numbers: ");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();

        double average = (num1 + num2 + num3) / 3;

        return (int) average;
    }
}