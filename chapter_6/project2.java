package chapter_6;
import java.util.*;
import java.io.*;

public class project2 {
    public static void main (String[] args) throws FileNotFoundException {
       
       // Scanner objects for console output and files.
        Scanner console = new Scanner(System.in);
        //prompt user for a file name
        System.out.print("Enter a first file name: ");
        String file1 = console.next();
        Scanner input1 = new Scanner(new File("chapter_6/data1.txt"));
        

        // prompt again for another
        System.out.print("Enter a second file name: ");
        String file2 = console.next();
        Scanner input2 = new Scanner(new File("chapter_6/data2.txt"));
        
        String diff = difference(input1, input2);
        System.out.println(diff);
        console.close();
    }

    // helper function to distinguish files
    public static String difference(Scanner input1, Scanner input2) {
        String diffWords = "";
        while (input1.hasNextLine() || input2.hasNextLine()) {
            String line1 = input1.nextLine();
            String line2 = input2.nextLine();

            // save result of function call in words variable
            diffWords = processLine(line1, line2); 
        }
        return diffWords;
    }

    // helper function for each line of each file
    public static String processLine(String line1, String line2) {
        // mini scanner to process each token of each line
        Scanner token1 = new Scanner(line1);
        Scanner token2 = new Scanner(line2);
        String differences = "";
        int lineNum = 1;

        // process word tokens and compare and contrast...
        while (token1.hasNext() || token2.hasNext()) {
            lineNum += 1;
            String word1 = token1.next();
            String word2 = token2.next();
            if (!word1.equals(word2)) {
                differences += "Differences found: \n Line " + lineNum + ": \n" + "< " + line1 +
                "\n> " + line2 + "\n";
                System.out.println();
            }
        }

        // close resources
        token1.close();
        token2.close();

        // return 
        return differences;
    }
}
