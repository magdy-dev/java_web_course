package firstTask.main;

import firstTask.entity.Calculator;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x, y");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double equationNum = calculator.equationNum3(x,y);
        System.out.println(" Math.sin(x) + Math.cos(y) * Math.cos(x) + Math.sin(y)* Math.tan(x * y) = " + equationNum);

    }

}
