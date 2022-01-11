package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter an operator");
        char operator = scan.next().charAt(0); // "-".charAt(0), "+"

        if (!(operator == '+' || operator == '-')) { // Condition: if the operator is Not valid
            System.err.println("Invalid Math Operator: " + operator);
            System.exit(0); // terminates the whole program

        }

        System.out.println("Enter a number");
        int num2 = scan.nextInt();
        System.exit(0);

    }


}
