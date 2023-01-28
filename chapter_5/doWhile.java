package chapter_5;
import java.util.Scanner;
import java.util.Random;

public class doWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // prompt for message
        System.out.print("A message? ");
        String message = console.nextLine();
        String answer;
        do {
            System.out.println(message);
            System.out.print("would you like to hear it again? [y/n] ");
            answer = console.next();
        } while (answer.equals("y"));

        //prompt for numbers. Will keep prompting until a number is greater than 900
        Random rand = new Random();
        int number;
        do {
            number = rand.nextInt(1001);
            System.out.println("Random Number: " + number);
        } while (number < 900);

        console.close();
    }
}
