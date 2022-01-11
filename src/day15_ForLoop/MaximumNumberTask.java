package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumberTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // max = 2

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt(); // 1, 2, 3
            System.out.println("max = " + max);

            if(num > max){
                max = num;
            }
        }

        System.out.println("max = " + max);

/*
  Task:
  Write a program that asks the user to enter a number for 5 times.
  Return the maximum number.
 */


    }



}
