package day07_Operators;

public class PreIncrementAndPostDecrementMyNotes {

    public static void main(String[] args) {

/*
            Unary Operators

    Operator    Name                     Meaning
       +        Unary Plus Operator      Indicates positive value
       -        Unary Minus Operator     Negates an expression or value
       ++       Increment Operator       Increments a value by 1
       __       Decrement Operator       Decrements a value by 1
 */

      //Example of Positive & Negative
      int a = -100; // must be written with -
      int b = +200; // can just be written 200

      boolean aIsNegative = a < 0; // -100 less than 0
      boolean bIsPositive = b > 0; // 200 grater than 0

      System.out.println(aIsNegative); // Prints -> true

      System.out.println("----------------------------------------------");

      int num = +25; // + is optional
      int mun = -25; // - is mandatory

        System.out.println("----------------------------------");

        //Example of Pre Increment
        int x = 10;
      System.out.println(++x); // Prints -> 11 (Increases the value by one immediately)
      //Example of Pre Decrement
      System.out.println(--x); // Prints -> 10 (Decreases the value by one immediately)


        ++a; //pre increment: increases the value by 1 right away
        System.out.println(a); // Prints -> 6

        --a; // pre decrement: decreases the value by 1 right away
        System.out.println(a); // Prints -> 5

        System.out.println("------------------------------------");

        int bb = 100;
        System.out.println(++bb); // Prints -> 11 (pre increment)

        int c = 100;
        System.out.println(c++); // post increment: Prints 100 in the 1st print statement.
        System.out.println(c); // post increment: Prints 101 in the 2nd print statement.

        System.out.println("--------------------------------------");

        int xx = 200;
        System.out.println( --xx ); // pre decrement: Prints 199 (decreases the value by 1 right away)

      System.out.println("-----------------------------------------------------------");

        //Example of post Increment & Decrement
        int y = 200;

        System.out.println( y-- ); // post decrement: Prints -> 200.
        System.out.println(y); // post decrement: Prints -> 199.

        System.out.println("---------------------------------------");

        int z = 45;
        System.out.println(++z); //pre increment: 46, z= 46
        System.out.println(z++); // post increment: 46, z = 47
        System.out.println(z); // post increment: 47

        System.out.println("----------------------------------------");

        int q = 30;
        System.out.println( --q ); // 29, q = 29 immediately
        System.out.println( q-- ); // 29, q = 29 first time you print eventually in the next step below
        System.out.println(q); // 29, q = 28 second time you print

        System.out.println("-----------------------------------------");






    }



}
