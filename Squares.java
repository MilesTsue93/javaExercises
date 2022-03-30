public class Squares {
    
    
    public static void main(String[] args) {
        
        int square = 0;

        // the squares of ten numbers without using * operator!
        for (int i = 1; i <= 20; i += 2) {
            square += i; 
            System.out.print(square + " ");
        }
    }
}
