package day08_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        boolean n1isMax = n1 > n2;
        boolean n2isMax = n1 < n2;
        boolean equal = n1 ==n2;

        if(n1isMax){
            System.out.println(n1 + " is the maximum number.");
        }
        if(n2isMax){
            System.out.println(n2 + " is the maximum number.");
        }
        if(equal){
            System.out.println(n1 + n2 + " are both equal.");
        }
/*
  Task:
  3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
 */








    }



}
