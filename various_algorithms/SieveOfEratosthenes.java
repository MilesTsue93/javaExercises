package various_algorithms;
public class SieveOfEratosthenes {

    public void sieve(int n) {

        //initilize boolean array to hold prime numbers
        //true = prime, else false = not prime
        boolean prime[] = new boolean[n];

        for(int i = 0; i < n; i++) {
            prime[i] = true;
        }

        // if "ith" element is prime, update the rest of the numbers divisible 
        // by it and numbers less than or equal to its square

        // iterating through the list of all numbers
        // up to N and checking each of them 
        //to see if their square is prime
        for (int i = 2; i * i < n; i++) {
            if(prime[i] == true) {
                
                // checking for divisibility of each 
                // prime number's square and
                // marking them off the list of possible primes
                for (int j = i*i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // print out all prime numbers less than or equal to n
        for (int i = 0; i < n; i++) {
            if (prime[i] == true) {

            
            System.out.print(i + " ");
            }
        }
    }

    public static void main (String[] args) {
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        int n2 = 60;
        s.sieve(n2); 
        }
    }


/**
 * This code has been contributed by Amit Khandelwal.
 * on GeeksForGeeks.com 
 */