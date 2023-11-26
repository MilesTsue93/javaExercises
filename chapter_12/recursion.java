package chapter_12;

class recursion {

    // write recursive version of the original iterative method
    public static void doubleReverse(String s) {
        if (s.length() - 1 == 0) {
            System.out.print(s.charAt(0)); 
            System.out.print(s.charAt(0)); 
        } else {
            doubleReverse(s.substring((s.length()) - (s.length() - 1)));
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(0));
        }
    }

    public static int factorial(int n) {
        int product = n;
        if (n == 1)
            return product;
        else {
            product *= factorial(n - 1);
        }
        return product;
    }

    public static void main(String[] args) {
        String test = "hello there!";
        doubleReverse(test);
        System.out.println();

        int n = factorial(6);
        System.out.println(n);
    } 
}