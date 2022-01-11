package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;

/*
       Using the if statement below
       if(number ==1){
       System.out.println("Monday");
       }
*/

        /* - switch can NOT be used with boolean, double, long, or float. It can be used with only int, byte, shor,
             char, or string.
           - switch statement is only used to compare if the data is equal ( == ) or not.
           - switch statement can Not be used for any oth boolean comparison such as (<= , >= ...)
        */

        switch (number) { //1,2,3,4,5,6,7 The days of the week.
            case 1: // First Case Block
                System.out.println("Monday");
                break; // exits the switch after executing the case block

            case 2: // Second Case Block
                 System.out.println("Tuesday");
                break; // exits the switch after executing the case block

            case 3: // Third Case Block
                System.out.println("Wednesday");
                break; // exits the switch after executing the case block

            case 4: // Fourth Case Block
                System.out.println("Thursday");
                break; // exits the switch after executing the case block

            case 5: // Fifth Case Block
                System.out.println("Friday");
                break; // exits the switch after executing the case block

            case 6: // Sixth Case Block
                System.out.println("Saturday");
                break; // exits the switch after executing the case block

            case 7: // Seventh Case Block
                System.out.println("Sunday");
                break; // exits the switch after executing the case block

            default: // If default block is the last case block then it's not necessary to write break below it.
                System.out.println("Invalid");
                break; //Not mandatory to write break since there is no other case bloch and only a curly brace } below.


        }





    }





}