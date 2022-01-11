package day20_Arrays;

import java.util.Arrays;

public class ArraysUtilityNotes2 {

    public static void main(String[] args) {

       String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
       String[] earlyBirds = Arrays.copyOf(students, 3); // will copy the first 3 names

        System.out.println(earlyBirds); // will print the first 3 names
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("--------------------------------------------------------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // index:       0   1   2   3   4   5   6   7   8    9

        int[] result = Arrays.copyOfRange(scores, 3, 7+1); // Or it can be written as just 8
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length);
        System.out.println(Arrays.toString(result2));





    }






}
