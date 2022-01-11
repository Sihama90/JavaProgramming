package day20_Arrays;

import java.util.Arrays;

public class ReverseArrayNamesTask {

    public static void main(String[] args) {

       int[] numbers = {10, 28, 30, 40};
       // index:        0   1   2   3
       int[] reversed = new int[numbers.length]; // To make sure that array has enough capacity
        System.out.println(Arrays.toString(reversed));
        /*
        reversed[0] = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];
         */

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(reversed);


/*
  4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A


	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


 */







    }




}
