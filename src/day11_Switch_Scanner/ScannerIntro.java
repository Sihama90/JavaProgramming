package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

       // Can also write it as:  Scanner scan = new Scanner(System.in);
      Scanner input  = new Scanner(System.in); //in means input to get info, out means output to display on screen.

        System.out.println("Enter an integer: "); // this message must be written before the next line below.
        int num1 = input.nextInt();

        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));


        input.close(); // closes the scanner, after this line scanner can Not be used anymore.





    }





}
