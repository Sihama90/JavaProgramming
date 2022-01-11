package day20_Arrays;

import java.util.Arrays;

public class ArraysUtilityNotes {

    public static void main(String[] args) {

       int[] numbers = {10, 9, 8, 0, 1, 2, 20, 4, 6, 7, 8};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));
        System.out.println("Min Number: " + numbers[0]);
        System.out.println("Min Number: " + numbers[numbers.length-1]);

        System.out.println("--------------------------------------------------------------------------");

        int[]arr1 = {1, 3, 2};
        int[]arr2 = {1, 2, 3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);

        System.out.println("--------------------------------------------------------------------------");

        char[]ch1 = {'a', 'c', 'b'};
        char[]ch2 = {'a', 'b', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //boolean anagram = Arrays.equals

    }




}
