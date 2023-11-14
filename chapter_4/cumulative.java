package chapter_4;
import java.util.Scanner;


public class cumulative {
    public static final String USAGE = "Usage [y/n]";
    

    public static void main(String[] args) {
        // define Scanner object
        Scanner console = new Scanner(System.in);

        // calculate the product
        //int result = productMaker(console);
        //System.out.println("Here is your product: " + result);

        // declare whether even or odd
        evenOrOdd(console);
    }

    public static int productMaker(Scanner console) {

        // user chooses a number
        System.out.print("Give me a number to increase: ");
        int product = console.nextInt();


        System.out.print("do you want to multiply this number [true/false]? ");
        String choice = console.next();

        // until user writes 'false' in console
        while ("y".equals(choice)) {

            // user chooses a factor
            System.out.print("Give me a number to multiply your last number by: ");
            int factor = console.nextInt();
            
            if("n".equals(choice)) {
                return product;
            }
            product *= factor;  

            // user chooses whether to continue multiplying number.
            System.out.print("Do you want to continue accumulating? [true/false]");
            choice = console.next();

            if (!("y".equals(choice) && "n".equals(choice))) {
                throw new IllegalArgumentException(USAGE);
            }
        }
        return product;
    }

    public static void evenOrOdd(Scanner console) {
        
        // declare user inputs
        System.out.print("What's your number, gurl??? ");
        int num = console.nextInt();

        // first number
        if (num % 2 == 0) {
            System.out.print("even\n");
        } else if (num % 2 != 0) {
            System.out.print("odd\n");
        }
        System.out.println();

        // only if true will code continue
        System.out.print("do you want to pick another??? ");
        String choice = console.next();

        //loop through this process until terminated by user
        while("y".equals(choice)) {

            // declare user inputs
            System.out.print("What's your number, gurl??? ");
            num = console.nextInt();

            if(num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            }

            System.out.print("do you want to pick another??? ");
            choice = console.next();

            if ("n".equals(choice)) {
                System.out.println("Have a nice day.");
            }
            if (!"y".equals(choice) && !"n".equals(choice)) {
                throw new IllegalArgumentException(USAGE);
            }
        }

    }
}
