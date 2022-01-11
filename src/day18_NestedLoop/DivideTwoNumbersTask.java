package day18_NestedLoop;

public class DivideTwoNumbersTask {

    public static void main(String[] args) {

      int a = 30; // a = 30 - 7 = 23 - 7 = 16 - 7 = 9 - 7 = 2
      int b = 7;
      int count = 0; // count = 1 = 1 = 2 = 1 = 3 = 1 = 4

      while(a >= b){ // While a is greater than be the statement will continue to be executed
          a -= b;
          count++;

          System.out.println(count + " with a remainder of " + a);
      }







/*
  Warmup
  1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

  Notes:
          20 / 6 ==> 3 with the remainder of 2
          a = 20
          b = 6;
          a -= b; // 14
          a -= b; // 8
          a -= b; // 2

          x = 100;
          y = 8;

          while(a >= b)
 */









    }




}
