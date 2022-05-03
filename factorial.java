public class factorial {
    public static int factorialMethod(int n) {
        if (n < 0) {  //throw exception if this is true
            throw new IllegalArgumentException("this is a negative number.");
        }

        int product = 1;  // 0! and 1! are both 1.
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;  //returning the factorial of n
    }

public static void main(String[] args) {
    System.out.println(factorialMethod(10));
    System.out.println(factorialMethod(-2));
    }
}

/**
 * this is from Building Java Programs: A Back to Basics Approach by 
 * Stuart Reges and Marty Stepp
 * Chapter 4: Conditional Execution
 */