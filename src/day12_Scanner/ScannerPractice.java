package day12_Scanner;

import java.util.Scanner; // Regular import: imports just one class, (uses less memory).
        //import java.util.*  -  Wild import: imports everything from the package, (uses more memory).

public class ScannerPractice {

    public static void main(String[] args) {

        //new Scanner(System.in).nextInt(); this way is not reusable must be retyped for every statement
        Scanner scan = new Scanner(System.in); //Scanner object can be reused.

        System.out.println("Enter a number between 1 to 7:");
        //byte num = scan.nextInt(); it would need to be cast using explicit casting it would become:
        // byte num = (byte) scan.nextInt();
        int num = scan.nextInt();
        String result = ""; //must have a temp value ""

        if(num >= 1 && num <= 7){
            result = (num == 1)?"Monday" :(num == 2)?"Tuesday" :(num == 3)?"Wednesday" :(num == 4)?"Thursday"
                    :(num == 5)?"Friday" :(num == 6)?"Saturday" : "Sunday";

        }else{
            result = "Invalid Number";
        }

        System.out.println(result);


            scan.close();


    }





}
