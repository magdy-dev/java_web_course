package secondTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Divisors {
    /**
     * 20. Determine the divisor of which numbers a, b, c is the number k.
     */
    private final Logger logger = LogManager.getLogger(Divisors.class);

    /**
     * this method to get the a,b,g divisor number
     * that for loop  for in ut number and we
     * check  if a % i = 0 and i % B = 0  so we get the g +1
     * @param a first number
     * @param b second number
     * @return g
     */
    public int countDivisors(int a, int b) {
        int i, g = 0;
        for (i = 1; i <= a; i++) {

            if (a % i == 0 && i % b == 0) {
                g++;
            }
        }
        return g;
    }
}






