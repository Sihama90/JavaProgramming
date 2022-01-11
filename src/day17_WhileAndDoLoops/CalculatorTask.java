package day17_WhileAndDoLoops;

import java.util.*;

public class CalculatorTask {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter you second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while(!(ch == '+' || ch == '-')){
            System.out.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+')? num1 + num2 : num1 - num2);


       scan.close();
    }


}
