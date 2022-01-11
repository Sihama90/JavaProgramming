package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumberTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // min = 2

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("min = " + min);

            if(num < min){
                min = num;
            }
        }

        System.out.println("min = " + min);


    }



}
