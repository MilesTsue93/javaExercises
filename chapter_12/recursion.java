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

    public static String starString(int n) {
        if (n < 0 ) {
            throw new IllegalArgumentException();
        }
        else if (n == 0) {
            return "*";
        }
        else if (n == 1) {
            return "**";
        }
        else {
           return starString(n - 1) + starString(n - 1);
        }
    }

    public static void writeNums(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("WTF mannnn!!!");
        }
        if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n - 1);
            System.out.print(", ");
            System.out.print(n);
        }
    }

    public static void writeSequence(int n) {
        if (n == 1) {
            System.out.print("1 ");
        }
        else if (n == 2) {
            System.out.print("1 1 ");
        } else {
            System.out.print((n+1) / 2 + " ");
            writeSequence(n - 2);
            System.out.print((n+1) / 2 + " ");
        } 
    }

    public static int perm(int n, int r) {
        if (n == 1 || r == 1) {
            return n;
        } else {
            return n * perm(n - 1, r - 1);
        }
    }

    public static void doubleDigits(int n) {
        if (n % 10 == 0) {
           return;
        } else {   
            doubleDigits(n/10);
            System.out.print(n%10);
            System.out.print(n%10);

        }
    }

    public static void writeBinary(int n) {
       if (n == 0) {
        return;
       } else {
        writeBinary(n/2);
        System.out.print(n%2);    
       }
    }

    public static void main(String[] args) {
        /* 
        String test = "hello there!";
        doubleReverse(test);
        System.out.println();

        int n = factorial(6);
        System.out.println(n);
        
        String n = starString(-1);
        System.out.println(n);
        */

        //writeNums(-3);
        //writeSequence(10);
        //int n = perm(6, 3);
        //System.out.println(n);
        
        //doubleDigits(567953);

        writeBinary(44);
    } 
}