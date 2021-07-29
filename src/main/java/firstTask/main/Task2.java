package firstTask.main;

import firstTask.entity.Calculator;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a, b");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double average = calculator.average(a,b);
        System.out.println("average is = " + average);

    }

}
