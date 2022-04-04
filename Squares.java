public class Squares {
    
    
    public static void main(String[] args) {
        
        // squaring exercise
        //square10();

        // fibonacci exercise
        fib(4);
    }

    public static void square10() {
        
        int square = 0;
        // the squares of ten numbers without using * operator!
        for (int i = 1; i <= 20; i += 2) {
            square += i; 
            System.out.print(square + " ");
        }
    }

    // a standard recursion problem. I used a parameter and returned an integer.
    public static int fib(int n) {
        
        if (n <= 2) {
             return 1;
        }
        return fib(n-1) + fib(n-2);      
    }
}


