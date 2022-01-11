package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

       // Create a variable that's capable enough to contain 5 names

        // This is a regular variable (means it can only hold one variable name)
       //String myGroup;

        // This is an array variable (means it can hold more than one variable name)
        //String[] myGroup = new String[5]; // Right now the length of this array is 5 (it can hold 5 variable names)
        //System.out.println(myGroup); // wrong way to print any array
        //System.out.println(Arrays.toString(myGroup)); // correct way to print array varaible

        // To assign names to the 5 variables: ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]
        String[] myGroup = new String [5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikkael";

        System.out.println(Arrays.toString(myGroup)); // Prints: ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("----------------------------------------------------------------------------------");

        // Write a program that asks the user to enter a number of days of the week
        // If you already now the names of the variables you want to print.
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:           0          1           2           3          4          5          6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number < 1 || number > 7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days); // It will print Saturday
        System.out.println(days[-1]); // it will print Friday



    }




}
