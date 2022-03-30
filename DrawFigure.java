public class DrawFigure {
  /*
  *** pseudocode ***
  1. draw exclamation marks in decreasing amount until bottom
  2. in place of exclamation marks, draw preceding back slashes and proceeding forward slashes  
  
  *** pseudocode revised ***
  1. for (line going 1 to 6)
        print exclamation marks (!)
        for (every line) 
            decrease !'s by 2
            print \\'s and //'s
        go to next line of output;
  */
    public static final int CONST = 4;
    public static final int HEIGHT = 6;
    public static final int finalNumSlash = 10;
    public static final int numExclaim = 22;
    
    public static void main(String[] args) {
        drawLine();
    }

    public static void drawLine() {

        // printing series of decreasing !'s
        // and increasing \ and /
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= numExclaim - 1; j++) {
                System.out.print("!");
            }
            for (int k = i; k <= 10; k++) {
                System.out.println("\\\\");
 
            }
        }
    }
}
