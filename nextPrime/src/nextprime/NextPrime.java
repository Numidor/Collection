/*
* Finds next prime, needs work on runtime.
*/
package nextprime;

import java.util.*;

class NextPrime {

    public static void main(String Ar[]) {
        int a = 0, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to test: ");
        a = in.nextInt();
        boolean[] nonPrime = new boolean[a + 1];
        for (i = 2; i <= Math.sqrt(a); ++i) {
            if (!nonPrime[i]) {
                for (j = i * 2; j <= a; j += i) {
                    nonPrime[j] = true;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (i = 2; i <= a; ++i) {
            if (!nonPrime[i]) {
                primes.add(i);
            }
        }
        for (j = a + 1;; j++) {
            for (i = 0; i < primes.size(); i++) {
                if (j % primes.get(i) == 0) {
                    break;
                }
            }
            if (i == primes.size()) {
                System.out.println(j);
                break;
            }
        }
    }
}
