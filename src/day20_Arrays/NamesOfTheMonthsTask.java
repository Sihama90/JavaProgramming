package day20_Arrays;

import java.util.Arrays;

public class NamesOfTheMonthsTask {

    public static void main(String[] args) {

      // Write a program to print name of the months

      String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
      // index:             0           1          2        3       4      5        6        7          8
              "October", "November", "December"};
       //        9           10          11
        System.out.println(Months);

        int month = 5;
        if(month < 1 || month > 12){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(Arrays.toString(Months));




    }




}
