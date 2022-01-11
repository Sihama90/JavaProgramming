package day07_Operators;

public class ShortHandOperatorsMyNotes {

    public static void main(String[] args) {



      int number = 100;
      System.out.println("number = " + number); // Prints -> 100

        number = 200;
      System.out.println("number = " + number); // Prints -> 200

        System.out.println("--------------------------------------");

      String word = "Java Programming";
      System.out.println("word = " + word); // Prints -> Java Programing

        word = "Wooden Spoon";
      System.out.println("word = " + word); // Prints -> Wooden Spoon

        System.out.println("---------------------------------------");

        //Addition Assignment:
      int x = 100;
      System.out.println("x = " + x);
      System.out.println(x + 200); // Prints -> 300

      x = x + 200; // In numbers, it looks like this -> 300 = 3 + 200;
      x += 200; //
      System.out.println("x = " + x); // Prints -> 500

        System.out.println("------------------------------------------");

      String str = "Wooden";
      str += "Spoon";
      System.out.println("str = + str");

        System.out.println("------------------------------------------");

      double num1 = 2.5;
      System.out.println("num1 = " + num1); // 2.5

      num1 += 5.5;
      System.out.println("num1 = " + num1); // 8.0

        System.out.println("-------------------------------------------");

      double availableBalance = 100.50;
      // deposit 300$
      //availableBalance += 300; // availableBalance = 100.50
      System.out.println("availableBalance = " + availableBalance); // 1300.5

      System.out.println("-----------------------------------------------------------");

      //withdrawing 500$ (from the available balance of 1300.5)
      //available += 500;it will add to the available balance of 1300.5 instead of withdrawing
      //availableBalance -=500; //now it will subtract from the available balance of 1300.5
      System.out.println("availableBalance = " + availableBalance);













    }




}
