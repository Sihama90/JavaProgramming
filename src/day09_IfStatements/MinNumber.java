package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");

        } else if (n1 > n2) {
            System.out.println(n2 + " is the minimum number");

        } else{
            System.out.println(n1 + " is equal to " + n2);


        }


    }


}



/* Task:
   1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers,
      if both are equal then print Equal

      Example:
               n1 = 100, n2 = 200;

        Output:
               100 is the minimum number
 */