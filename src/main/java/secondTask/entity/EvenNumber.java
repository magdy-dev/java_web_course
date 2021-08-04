package secondTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 35. that class for Find the number of even digits of a given natural number.
 */
public class EvenNumber {
    private final Logger logger = LogManager.getLogger(EvenNumber.class);

    /**
     * this method we make for loop to count the input number
     * than check with if x % 2   so give the result if not so give false
     * @param number first number
     * @return
     */
    public int getEvenNumber(int number) {
        for (int x = 1; x <= number; x++)
            if (x % 2 == 0) {
                return x;
            } else
                logger.error(" error its not even number");
        return -1 ;
    }
}
