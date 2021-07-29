package firstTask.main;

import firstTask.entity.Calculator;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {


            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter d");
            double d = scanner.nextDouble();
            double OldNumber = calculator.getOldNumber(d);

            System.out.println("d % length *10 = " + OldNumber);





    }

}
