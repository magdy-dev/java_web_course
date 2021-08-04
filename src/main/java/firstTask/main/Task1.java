package firstTask.main;

import firstTask.entity.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        switch (number) {
            case 1:
                Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a, b, c");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double root = calculator.calculateRoot(a, b, c);
            System.out.println("root result = " + root);
            break;
            case 2:
                Calculator calculator1 = new Calculator();
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("enter a, b");
                double a1 = scanner1.nextDouble();
                double b1 = scanner1.nextDouble();
                double average = calculator1.average(a1,b1);
                System.out.println("average is = " + average);
                break;
            case 3:
                Calculator calculator2 = new Calculator();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("enter x, y");
                double x = scanner2.nextDouble();
                double y = scanner2.nextDouble();
                double equationNum = calculator2.equationNum3(x,y);
                System.out.println(" Math.sin(x) + Math.cos(y) * Math.cos(x) + Math.sin(y)* Math.tan(x * y)  = " + equationNum);
                break;
            case 4:
                Calculator calculator3 = new Calculator();
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("enter d");
                double d = scanner3.nextDouble();
                double OldNumber = calculator3.getOldNumber(d);

                System.out.println("d % length *10 = " + OldNumber);

                break;
            default:
                System.out.println("error ......");
        }

    }

}
