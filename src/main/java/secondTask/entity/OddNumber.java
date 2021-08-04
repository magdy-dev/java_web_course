package secondTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OddNumber {
    private final Logger logger = LogManager.getLogger(Divisors.class);

    /**
     * that method need to get the odd number
     * we do while loop than  check with if odd number  so give us all
     * @param OddNumber first number
     * @return OddNumber
     */
    public int getOddNumbers(int OddNumber) {

        while (OddNumber < 100) {
            if (OddNumber % 2 == 0) {
                logger.error("error its not odd number");
            }
            return OddNumber;
        }
        return -1;
    }
}

