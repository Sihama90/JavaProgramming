package day16_ForLoopStringPractice;

public class ReverseStringTask {

    public static void main(String[] args) {

        //Not Using For Loops

    String str = "Wooden Spoon";
    //index:      0123456789...

    String result = ""; //contain the reversed version of str
    //noopS  nedooW

    //CharAt Method One by One:
    result += str.charAt(11); // n
    result += str.charAt(10); // o
    result += str.charAt(9); // o
    result += str.charAt(8); // p
    result += str.charAt(7); // S
    result += str.charAt(6); // " " (empty space)
    result += str.charAt(5); // n
    result += str.charAt(4); // e
    result += str.charAt(3); // d
    result += str.charAt(2); // o
    result += str.charAt(1); // o
    result += str.charAt(0); // W
        System.out.println(result);

        System.out.println("------------------------------------------------------------------");

        // Using For Loops (One of the asked questions on a Interview)

        String str1 = "Wooden Spoon";
        //index:      0123456789...

        String result1 = ""; //contain the reversed version of str
        //noopS  nedooW

        for (int i = str.length()-1; i >= 0; i--) {
                 result1 += str.charAt(i); // + here is the concatenation (adding each character to result)
        }

        System.out.println(result1);


        System.out.println("------------------------------------------------------------------");
/*
  Task:
  1. Write a program that can reverse a String
     Example:
             input:
                   Wooden Spoon
             output:
                   noopS nedooW
 */







    }





}
