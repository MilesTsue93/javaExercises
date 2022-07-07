package chapter_6;
import java.util.Scanner;
import java.io.*;


public class project1 {
    public static void main(String[] args) throws FileNotFoundException {
        //construct a Scanner object
        Scanner input = new Scanner(new File("chapter_6/sunhwa-speech.txt"));
        PrintStream output = new PrintStream(new File("my_letter2.pdf"));
        // calling this utility function to process each line of text
        process(input, output);
    }

    // utility function to process each line of input in file
    public static void process(Scanner input, PrintStream output) {
        int totalWords = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            totalWords += countWordsInLine(line, output);
        }

        output.println("number of words in text: " + totalWords);
    }
    
    //helper function for process function
    public static int countWordsInLine(String line, PrintStream output) {
        Scanner token = new Scanner(line);
        int count = 0;
        
        // countin each line's words
        while (token.hasNext()) {
            String word = token.next();
            count += 1;
            output.print(word + " ");
        }
        output.println();
        token.close();
        return count;
    }
}

