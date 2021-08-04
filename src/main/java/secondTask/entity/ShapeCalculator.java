package secondTask.entity;

/**
 *  Make a program that will determine the area of ​​which circle is smaller
 */
public class ShapeCalculator {
    /**
     * this method to get the area circle
     * will be area  = radius * radius *PI
     * @param radius first number
     * @return area
     */
    public double getSmallestCircle(int radius) {
        double area;
        area = (radius * radius) * Math.PI;
        return area;
    }

}
