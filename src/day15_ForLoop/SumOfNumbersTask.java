package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbersTask {

    public static void main(String[] args) {

       double sum = 0;
       //Example of short cut for trying the for:  fori + enter
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("------------------------------------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }


         scan.close();

    }




}
