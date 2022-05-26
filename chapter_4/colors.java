package chapter_4;

import java.util.Scanner;
public class colors {

    // constant for proper input
    public static final String USAGE = "Usage: [B/G/R]";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String choice = chooseColor(console);
        String choice2 = chooseColor(console);

        System.out.println("You have chosen " + choice);
        System.out.println("You have chosen " + choice2);
    }

    // method for lengthening the char version of color
    // into the actual color name
    public static String chooseColor(Scanner console) {
        System.out.print("What color do you want? ");

        //will always be uppercase whether it's lower or upper case letter
        String color = console.next().toUpperCase();

        if (color == "B") {
            color += "lue";
            return color;
        } else if (color == "G") {
            color += "reen";
            return color;
        } else if (color == "R") {
            color += "ed";
            return color;
        } else {
            System.out.println("Unknown color: " + color);
            return color;
        } 

    }


    
}
