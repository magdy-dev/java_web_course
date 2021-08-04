package secondTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 5. Make a program: determine the smallest of two numbers a and b
 */
public class SmallestNumber {
    private final Logger logger = LogManager.getLogger(Divisors.class);
    /**
     *  this method to get witch the smallest number
     * @param a first
     * @param b second
     * @return a or b
     */
    public double findSmallest(double a, double b) {
        logger.info("determine Smallest Of TwoNumbers");
        if (a > b) {
            return   b;
        } else {
            return a;
        }
    }
}
