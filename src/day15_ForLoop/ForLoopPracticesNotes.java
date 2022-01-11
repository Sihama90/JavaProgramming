package day15_ForLoop;

public class ForLoopPracticesNotes {

  public static void main(String[] args) {

    //Loop: means a repeated action
    //for loop: the iteration is fixed
    //Example of for loop:                            for(initialization; condition; iteration){
    //                                                   statements
    //                                                }
    //                                                initialization: starting point
    //                                                         int i = 5;
    //                                                condition: ending point
    //                                                       i < 10, i >= 0
    //                                                iterator: Co-related to the condition. (runs long enough to make the
    //                                                                                     condition false)

    //while loop: the iteration is not fixed. (repeated If)
    // Example of while loop:                                   while(condition){
    //                                                              statement
    //                                                          }
    // do-while loop: iteration is not fixed
    // Example of do while loop:                               do{
    //                                                              statements
    //                                                         }while(condition);
    //                                                         (at least gets executed once)
    //


    //Example using For Loop to print 15, 15, 17, 18,....45 all on one line.
    for (int i = 15; i <= 45; i++) { //To increase I value by one each time  i++.
      System.out.print(i++ + " "); // using System.out print to print all numbers on one line.
    }

    System.out.println("---------------------------------------------------------------------------");

    //Example using For Loop to print 100, 99, 98, 97,...50 all on the same line.
    for (int i = 100; i >= 50; i--) { //To decrease I value by one each time  i--.
      System.out.print(i + " "); // using System.out print to print all numbers on one line.
    }

    System.out.println("---------------------------------------------------------------------------");

    //Example using For Loop to print 100, 99, 98, 97,...50 all on the same line.
    for (int i = 100; i > 49; i--) { //To decrease I value by one each time  i--.
      System.out.print(i + " "); // using System.out print to print all numbers on one line.
    }

    System.out.println("----------------------------------------------------------------------------");

    //Example using For Loop to print all the even numbers between 1 ~ 55 0 all on the same line.
    for (int i = 1; i <= 55; i++) { //To increase I value by one each time  i++.
      if (i % 2 == 0) {
        System.out.print(i++ + " "); // using System.out print to print all numbers on one line.
      }

    }
    System.out.println("----------------------------------------------------------------------------");

    //Another example using For Loop to print all the even numbers between 1 ~ 55 0 all on the same line.
    for (int i = 2; i <= 54; i += 2) { //To increase I value by one each time  i++.
        System.out.print(i + " "); // using System.out print to print all numbers on one line.
    }

    /*
    A ~ Z
    a ~ z
    Z ~ A
    z ~ a


     */


  }


}
