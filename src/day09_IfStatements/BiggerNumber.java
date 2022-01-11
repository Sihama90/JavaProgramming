package day09_IfStatements;

public class BiggerNumber {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

       String biggerNum = (n1 > n2 && n1 > n3)? "n1" :(n2 > n1 && n2 > n3)? "n2" :"n3";
        System.out.println(biggerNum + " is bigger");
/*
  Task:
  5. Create a class called BiggerNum, write a program that checks for the biggest of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */







    }





}
