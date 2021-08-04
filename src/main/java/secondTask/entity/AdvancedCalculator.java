package secondTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 */
public class AdvancedCalculator {

    private final Logger logger = LogManager.getLogger(AdvancedCalculator.class);
    /**
     * this method calculate factorial
     * in case n is negative return -1
     * @param n first number
     * @return factorial
     */
    public long getFactorial(int n) {

        long fact = 1;

        if (n < 0) {
            logger.error(" the  entered number is negative");
            return -1;
        }
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        return fact;

    }
}
