package firstTask.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Calculator {
    private final Logger logger = LogManager.getLogger(Calculator.class);

    public Double calculateRoot(double a, double b, double c) {
        logger.info("start calculating root for ax^2 - bx * c");
        double x1 = -1;
        double x2 = -1;
        if (a == 0) {
            return null;
        }
        double desc = Math.pow(b, 2) - 4 * a * c;
        if (desc > 0) {
            x1 = (-b + Math.sqrt(desc)) / (2 * a);
            x2 = (-b - Math.sqrt(desc)) / (2 * a);
        } else {
            if (desc == 0) {
                x1 = -b / (2 * a);
            } else {
                logger.info("no korin");
            }
        }
        if (x1 > 0) {
            return x1;
        } else if (x2 > 0) {
            return x2;
        }
        return null;
    }
//____________________________________________________________________________________________________

    public double average(double a, double b) {
        logger.info("start calculate average");
        return (a + b) / 2;
    }

    //____________________________________________________________________________________________________


    public double equationNum3(double x, double y){
        logger.info ("sin(x) + cos(y) * cos(x) + sin(y) * tg(xy)");
        return Math.sin(x) + Math.cos(y) * Math.cos(x) + Math.sin(y)* Math.tan(x * y);
    }

    //____________________________________________________________________________________________________
    public int getOldNumber(double d){
        logger.info("Old Number");
        int length = (int) Math.log10(d) + 1;
        return (int)(d % length *10);
    }

    public int getYoungNumber(double d){
        logger.info("Young Number");
        double num = d * 10;
        return (int)(num % 10);
    }


    public double areaCircle(double d){
        logger.info("Area Circle");
        return d*d/4/Math.PI;

    }

}
