package chapter_4;
import java.util.Scanner;


public class cumulative {
    public static final String USAGE = "Usage [true/false]";

    public static void main(String[] args) {
        // define Scanner object
        Scanner console = new Scanner(System.in);

        // calculate the product
        int result = productMaker(console);
        System.out.println("Here is your product: " + result);
    }

    public static int productMaker(Scanner console) {

        // user chooses a number
        System.out.print("Give me a number to increase: ");
        int product = console.nextInt();


        System.out.print("do you want to multiply this number [true/false]? ");
        boolean choice = console.nextBoolean();

        // until user writes 'false' in console
        while (choice == true) {

            // user chooses a factor
            System.out.print("Give me a number to multiply your last number by: ");
            int factor = console.nextInt();
            
            if(choice == false) {
                return product;
            }
            product *= factor;  

            // user chooses whether to continue multiplying number.
            System.out.print("Do you want to continue accumulating? [true/false]");
            choice = console.nextBoolean();

            if (choice != true && choice != false) {
                throw new IllegalArgumentException(USAGE);
            }
        }
        return product;
    }
}
