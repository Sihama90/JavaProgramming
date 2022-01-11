package practice_12_08_2021;

import java.util.Scanner;

public class FibonacciTask {

    public static void main(String[] args) {

/*
    This is an Interview Question

    Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

                         */
/*
    Note:
    The first 21 Fibonacci numbers F`n are:[2]

    F0    F1    F2    F3    F4    F5    F6    F7    F8    F9    F10    F11    F12    F13    F14    F15    F16  F17    F18    F19    F20
     0    1    1    2    3    5    8    13    21    34    55    89    144    233    377    610    987    1597    2584    4181    6765

        Fibonacci_number
        Sequence properties — In his 1202 book Liber Abaci, Fibonacci introduced the sequence to Western European
        mathematics, although the sequence had been ...
        ‎Fibonacci numbers in popular... · ‎Category · ‎Integer sequence · ‎Golden ratio

        Fibonacci Sequence - Math is Funhttps://www.mathsisfun.com/ › numbers › fibonacci-seq...
        The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is
        found by adding up the two numbers before it:.

        What Is the Fibonacci Sequence? | Live Sciencehttps://www.livescience.com/ › 37470-fibonacci-sequence
        The Fibonacci sequence is one of the most famous formulas in mathematics. Each number in the sequence is
        the sum of the two numbers that ...
        Oct 24, 2018
        People also ask
        Why is the Fibonacci sequence so important?
        Image result for fibonacci sequence
        The Fibonacci sequence is significant because of the so-called golden ratio of 1.618, or its inverse 0.618.
        In the Fibonacci sequence, any given number is approximately 1.618 times the preceding number, ignoring the
        first few numbers.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see?");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int result = 0; // if multiplication than result would be 1.
        System.out.println(num1);
        System.out.println(num2);

        for(int i = 2; i < number; i++){
            result = num1 + num2;
            System.out.println(result);
            num1 = num2;
            num2 = result;
        }

    }





}
