
package day11_Switch_Scanner;

public class Convert_Numbers_To_Words {

    public static void main(String[] args) {


      int num = 2;
      boolean b = true;

      switch (num) {
          case 0:
              b = false;
          case 1:
              System.out.println(1);
          case 2:
              if (b) {
                  System.out.println(2);
              } else {
                  b = false;
              }
          case 3:
              if (b) {
                  System.out.println(3);
              } else {
                  break;
              }
          case 4:
              System.out.println(4);
          case 5:
              if (!b) {
                  break;
              }
              System.out.println(5);
      }
        /*Using Ternaries
        int number = 7;
        String result = (number >= 0 && number <= 9)?
                        (number == 0)?"Zero" :(number == 1)?"One" :(number == 2)?"Two" :(number == 3)?"Three"
                        :(number == 4)?"Four" :(number == 5)?"Five" :(number == 6)?"Six" :(number == 7?"Seven"
                        :(number == 8)?"Eight" :"Nine";
                 //: "Invalid Number";


        System.out.println(result);



/*
  Task:
  2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */







    }






}
